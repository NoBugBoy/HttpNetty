package server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.logging.LoggingHandler;
import server.database.ConnUtils;


public class NioWebSocketChannelInit extends ChannelInitializer<SocketChannel>{

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline().addLast("logging",new LoggingHandler("DEBUG"));
        ch.pipeline().addLast("httpreqd",new HttpRequestDecoder());
        ch.pipeline().addLast("httprese",new HttpResponseEncoder());
        ch.pipeline().addLast("aggregator",new HttpObjectAggregator(1024*1024));
        ch.pipeline().addLast("httpHandler",new HttpHandler());
    }
}
