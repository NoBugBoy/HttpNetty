package server;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yujian
 * @email 754369677@qq.com
 * 自定义异常返回
 */
public class ErrorCodeResponse {
    private  static  final Logger logger = LoggerFactory.getLogger(ErrorCodeResponse.class);
    protected static Map<String,String> httpResponse = new ConcurrentHashMap<>(2);
    public static FullHttpResponse requestMethodError(String method){
        synchronized (httpResponse){
            httpResponse.put("error","Request method '"+method+"' not supported");
            httpResponse.put("code","405");
            return baseResponse(httpResponse,405);
        }
    }
    public static FullHttpResponse BadRequest(){
        synchronized (httpResponse){
            httpResponse.put("error","Bad Request");
            httpResponse.put("code","400");
            return baseResponse(httpResponse,400);
        }
    }
    public static FullHttpResponse systemError(){
        synchronized (httpResponse){
            httpResponse.put("error","System Error");
            httpResponse.put("code","500");
            return baseResponse(httpResponse,500);
        }
    }
    public static FullHttpResponse requestTypeError(String type){
        synchronized (httpResponse){
            httpResponse.put("error","Request Content-Type '"+type+"' not supported");
            httpResponse.put("code","490");
            return baseResponse(httpResponse,490);
        }
    }
    public static FullHttpResponse requestUrlUnknown(String url){
        synchronized (httpResponse){
            httpResponse.put("error","Request Url '"+url+"' not supported");
            httpResponse.put("code","404");
            return baseResponse(httpResponse,404);
        }
    }

    /**
     *  JSON格式返回
     * @param map
     * @return
     */
    protected static FullHttpResponse baseResponse(Map<String,String> map,Integer code){
        FullHttpResponse fullHttpResponse = null;
        try {
            fullHttpResponse = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.valueOf(code), Unpooled.wrappedBuffer(
                    JSON.toJSONString(map).getBytes("utf-8")
            ));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        fullHttpResponse.headers().set("Content-Type", "application/json;charset=UTF-8");
        fullHttpResponse.headers().set("Content-Length", fullHttpResponse.content().readableBytes());
        fullHttpResponse.headers().set("Connection", "keep-alive");
        logger.info("返回值：{}",JSON.toJSONString(httpResponse));
        return fullHttpResponse;
    }
}
