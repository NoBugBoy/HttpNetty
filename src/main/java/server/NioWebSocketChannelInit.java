package server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * @author yujian
 * @email 754369677@qq.com
 * 初始化管道
 */
public class NioWebSocketChannelInit extends ChannelInitializer<SocketChannel>{

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline().addLast("logging",new LoggingHandler("DEBUG"));
        ch.pipeline().addLast("codec",new HttpServerCodec());
//        ch.pipeline().addLast("httpreqd",new HttpRequestDecoder());
        ch.pipeline().addLast(new ChunkedWriteHandler());
//        ch.pipeline().addLast("httprese",new HttpResponseEncoder());
        ch.pipeline().addLast("aggregator",new HttpObjectAggregator(10240*1024));
        ch.pipeline().addLast("httpHandler",new HttpHandler());
        ch.pipeline().addLast("FileUpLoadHandler",new FileUpLoadHandler());
    }
}
