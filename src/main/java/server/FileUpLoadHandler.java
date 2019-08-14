package server;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.multipart.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yujian
 * @email 754369677@qq.com
 * 只负责文件上传
 */
public class FileUpLoadHandler extends SimpleChannelInboundHandler<HttpObject> {
    private static final HttpDataFactory factory = new DefaultHttpDataFactory(true);
    private HttpPostRequestDecoder httpDecoder;
    HttpRequest request;
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject httpObject) throws Exception {
        if(httpObject instanceof HttpContent){
            ((HttpContent) httpObject).retain();
            request = (HttpRequest) httpObject;
            httpDecoder = new HttpPostRequestDecoder(factory,request);
            httpDecoder.setDiscardThreshold(0);
            HttpContent chunk = (HttpContent)httpObject;
            httpDecoder.offer(chunk);
            if(chunk instanceof LastHttpContent){
                writeChunk(ctx);
            }
            // ReferenceCountUtil.release(httpObject);
        }
    }
    private void writeChunk(ChannelHandlerContext ctx) throws IOException {
        while (httpDecoder!=null && httpDecoder.hasNext()) {
            InterfaceHttpData data = httpDecoder.next();
            if (data != null && InterfaceHttpData.HttpDataType.FileUpload.equals(data.getHttpDataType())) {
                final FileUpload fileUpload = (FileUpload) data;
                final File file = new File( fileUpload.getFilename());
                try (FileChannel inputChannel = new FileInputStream(fileUpload.getFile()).getChannel();
                     FileChannel outputChannel = new FileOutputStream(file).getChannel()) {
                    //这里有IO了想怎么玩都可以
                    outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
                    Map map = new HashMap<>(2);
                    map.put("code",200);
                    map.put("msg","上传成功");
                    FullHttpResponse fullHttpResponse = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, Unpooled.wrappedBuffer(
                            JSON.toJSONString(map).getBytes("utf-8")
                    ));
                    fullHttpResponse.headers().set("Content-Type", "application/json;charset=UTF-8");
                    fullHttpResponse.headers().set("Content-Length", fullHttpResponse.content().readableBytes());
                    fullHttpResponse.headers().set("Connection", "keep-alive");
                    httpDecoder.destroy();
                    httpDecoder = null;
                    ctx.writeAndFlush(fullHttpResponse);
                }
            }
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        if(httpDecoder != null){
            httpDecoder.cleanFiles();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
        System.out.println(cause);cause.printStackTrace();
    }
}
