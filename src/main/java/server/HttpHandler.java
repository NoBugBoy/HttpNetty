package server;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Charsets;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import org.slf4j.Logger;
import server.anno.NettyRequestBody;
import server.anno.NettyRequestMapping;
import server.anno.NettyRequestParam;
import server.anno.NettyRestController;
import server.exception.NettyRequestBodyException;
import server.utils.GlobalController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

/**
 * @author yujian
 * @email 754369677@qq.com
 * 核心处理器，负责整个Http请求的流程，分发，响应
 */
public class HttpHandler extends SimpleChannelInboundHandler<Object>{
    protected final Logger logger = org.slf4j.LoggerFactory.getLogger(HttpHandler.class);
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object request) throws Exception {

        if(request instanceof  FullHttpRequest){
            long startTime = System.currentTimeMillis();
            FullHttpRequest full = (FullHttpRequest) request;
            if(full.uri().endsWith(".ico")){
                //过滤一些无用的请求，等到时候写成filter链式拦截
                return;
            }
            String reqUrl = full.uri().substring(full.uri().indexOf("/"),full.uri().indexOf("?")<=0?full.uri().length():full.uri().indexOf("?"));
            //路径满足根据不同路径触发不同的任务
            Set<Class<?>> controllers = GlobalController.getInstance();
            for (Class<?> controller : controllers) {
                String prefix = "";
                if(controller.isAnnotationPresent(NettyRestController.class)){
                    //拼接controller和
                    prefix = prefix + controller.getAnnotation(NettyRestController.class).value();
                }
                Object bindParams = paramFilter(full);
                if(bindParams instanceof FullHttpResponse){
                    ctx.writeAndFlush(bindParams);
                    return;
                }
                for (Method method : GlobalController.getMethods(controller)) {
                    boolean annotationPresent = method.isAnnotationPresent(NettyRequestMapping.class);
                    if(annotationPresent){
                        NettyRequestMapping annotation = method.getAnnotation(NettyRequestMapping.class);
                        if(reqUrl.equals(prefix+annotation.value())){
                            logger.info("请求路径：{} , 请求方式:{}",prefix+annotation.value(),full.method().name());
                            if("/file/upload".equals(annotation.value()) && Constance.POST.equals(full.method().name())){
                                ctx.fireChannelRead(request);
                                return;
                            }
                            logger.info("请求参数：{}",JSON.toJSONString(bindParams));
                            int length = annotation.method().length;
                            //请求的方法是否支持
                            for (int i = 0; i < length; i++) {
                                if(full.method().name().toUpperCase()==annotation.method()[i].name()){
                                    Parameter[] parameters = method.getParameters();
                                    List<Object> getParams = new ArrayList<>(parameters.length);
                                    //参数个数 x如果大于1抛出异常
                                    int x = 0;
                                    for (int i2 = 0; i2 < parameters.length; i2++) {
                                        //有注解的
                                        Parameter parameter = parameters[i2];
                                        //暂时只认为存在一个NettyRequestBody注解
                                        if(parameter.isAnnotationPresent(NettyRequestBody.class)){
                                            //如果有NettyRequestBody那么有且只有一个参数
                                            if(parameters.length > 1){
                                                ctx.writeAndFlush(ErrorCodeResponse.systemError());
                                                throw new NettyRequestBodyException("MethodParam");
                                            }
                                            boolean required = parameter.getAnnotation(NettyRequestBody.class).required();
                                            if(required){
                                                if(bindParams == null){
                                                    ctx.writeAndFlush(ErrorCodeResponse.BadRequest());
                                                    return;
                                                }
                                            }
                                            String s = JSONObject.toJSONString(bindParams);
                                            bindParams = JSONObject.parseObject(s, parameter.getType());
                                            x++;
                                        }
                                        if(parameter.isAnnotationPresent(NettyRequestParam.class)){
                                            Map<String,Object> map =  (Map)bindParams;
                                            Object obj = map.get(parameter.getAnnotation(NettyRequestParam.class).value());
                                            Object cast = castType(obj, parameter.getType());
                                            getParams.add(cast);
                                        }
                                    }
                                    if (x > 1) {
                                        ctx.writeAndFlush(ErrorCodeResponse.systemError());
                                        throw new NettyRequestBodyException("NettyRequestBodyAnnotation");
                                    }
                                    method.setAccessible(true);
                                    Object invoke ;
                                    if(parameters.length == 0){
                                        invoke =  method.invoke(controller.newInstance());
                                    }else{
                                        if(getParams.size() > 0){
                                            //todo 这他妈怎么传啊.. 给个固定的算了 超过5个参数就报错 NN的
//                                            Object[] objects = getParams.toArray();
//                                            method.invoke(controller.newInstance(),objects);
                                            invoke = invoke(method, controller, getParams);
                                        }else{
                                            try{
                                                invoke =  method.invoke(controller.newInstance(),bindParams);
                                            }catch (IllegalArgumentException e){
                                                ctx.writeAndFlush(ErrorCodeResponse.BadRequest());
                                                break;
                                            }
                                        }
                                    }

                                    if(invoke != null){
                                        logger.info("返回值：{}",JSON.toJSONString(invoke));
                                        FullHttpResponse fullHttpResponse = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, Unpooled.wrappedBuffer(
                                                JSON.toJSONString(invoke).getBytes("utf-8")
                                        ));
                                        fullHttpResponse.headers().set("Content-Type", "application/json;charset=UTF-8");
                                        fullHttpResponse.headers().set("Content-Length", fullHttpResponse.content().readableBytes());
                                        fullHttpResponse.headers().set("Connection", "keep-alive");
                                        ctx.writeAndFlush(fullHttpResponse);
                                    }else{
                                        ctx.writeAndFlush(ErrorCodeResponse.systemError());
                                        return;
                                    }
                                    logger.info("本次请求耗时：{} 毫秒",(System.currentTimeMillis() - startTime));
                                    return;
                                }
                            }
                            //该方法不支持这种请求方式
                            FullHttpResponse fullHttpResponse = ErrorCodeResponse.requestMethodError(full.method().name().toUpperCase());
                            ctx.writeAndFlush(fullHttpResponse);
                            return;
                        }
                    }

                }
            }
            //找不到这个请求路径
            FullHttpResponse fullHttpResponse = ErrorCodeResponse.requestUrlUnknown(reqUrl);
            ctx.writeAndFlush(fullHttpResponse);
//
        }

    }
    private static  Object invoke(Method method,Class<?> clazz,List<Object> params) throws Exception{
        switch (params.size()){
            case 1: return method.invoke(clazz.newInstance(),params.get(0));
            case 2: return method.invoke(clazz.newInstance(),params.get(0),params.get(1));
            case 3: return method.invoke(clazz.newInstance(),params.get(0),params.get(1),params.get(2));
            case 4: return method.invoke(clazz.newInstance(),params.get(0),params.get(1),params.get(2),params.get(3));
            case 5: return method.invoke(clazz.newInstance(),params.get(0),params.get(1),params.get(2),params.get(3),params.get(4));
            default:return null;
        }
    }
    /**
     * 参数类型转换
     * @author yujian
     * @param obj 转换之前的参数
     * @param clazz 参数类型
     * @param <T> 返回类型
     * @return T
     */
    public static <T> Object castType(Object obj,Class<T> clazz){
        try {
            Method valueOf = clazz.getMethod("valueOf",String.class);
            Object result = valueOf.invoke(null,String.valueOf(obj));
            return result;
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return obj;
    }
    /**
     * 参数格式化
     * @param request
     * @return
     */
    public Object paramFilter(FullHttpRequest request) {
        HttpMethod method = request.method();
        String body = request.content().toString(Charsets.UTF_8);
        if(Constance.POST.equals(method.name().toUpperCase())&&( body == null || "".endsWith(body))){
            return null;
        }
        Map<String,Object> params = new HashMap<>();
        switch (method.name().toUpperCase()){
            case Constance.GET :
                if(request.uri().indexOf("?")<=0){
                    return params;
                }
                String uri = request.uri().substring(request.uri().indexOf("?")+1);
                boolean c = uri.indexOf("&") > 0;
                if(!c){
                    if(uri.indexOf("=")>0){
                        params.put(uri.split("=")[0],uri.split("=")[1]);
                    }else{
                        System.out.println(request.uri()+"无任何参数！");
                    }
                }else{
                    String[] split = uri.split("&");
                    if(split.length > 0){
                        for (int i = 0; i < split.length; i++) {
                            String[] split1 = split[i].split("=");
                            params.put(split1[0],split1[1]);
                        }
                    }else{
                        if(uri.indexOf("=") > 0){
                            params.put(uri.split("=")[0],uri.split("=")[1]);
                        }else{
                            System.out.println(request.uri()+"无任何参数！");
                        }
                    }
                }
                return  params;
            case Constance.POST :
            case Constance.PUT  :
            case Constance.DELETE:
                String ctype = request.headers().get("Content-Type");
                if("application/json".equals(ctype)){
                    JSONObject jsonObject = JSON.parseObject(body);
                    for (String key : jsonObject.keySet()) {
                        params.put(key,(String) jsonObject.get(key));
                    }
                    return params;
                }else if("application/x-www-form-urlencoded".equals(ctype)){
                    boolean b = body.indexOf("&") > 0;
                    if(!b){
                        if(body.indexOf("=")>0){
                            params.put(body.split("=")[0],body.split("=")[1]);
                        }else{
                            System.out.println(request.uri()+"无任何参数！");
                        }
                    }else{
                        String[] split = body.split("&");
                        if(split.length > 0){
                            for (int i = 0; i < split.length; i++) {
                                String[] split1 = split[i].split("=");
                                params.put(split1[0],split1[1]);
                            }
                        }else{
                            if(body.indexOf("=")>0){
                                params.put(body.split("=")[0],body.split("=")[1]);
                            }else{
                                System.out.println(request.uri()+"无任何参数！");
                            }
                        }
                    }
                }else if(ctype.startsWith("multipart/form-data")){
                    return params;
                }
                else{
                    return  ErrorCodeResponse.requestTypeError(ctype);
                }
                return params;
            default:return params;
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println(cause);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }
}
