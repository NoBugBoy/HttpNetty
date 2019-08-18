package server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.AdaptiveRecvByteBufAllocator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import server.anno.NettyRestController;
import server.utils.GlobalController;
import server.utils.ServiceInjector;
import server.utils.SqlSessionUtils;

import java.io.FileInputStream;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;
/**
 * @author yujian
 * @email 754369677@qq.com
 * 入口类，初始化组件
 */
public class NettyServer {
    protected final Logger logger = LoggerFactory.getLogger(NettyServer.class);
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("netty.properties"));
            new NettyServer(Integer.valueOf(properties.getProperty(Constances.SERVER_PORT))).start(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int port;


    public NettyServer(int port) {
        this.port = port;
    }
    public void start(Properties properties) throws Exception{

        logger.info("启动 Http Netty  ..");
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();
        logger.info("运行端口："+port);
        logger.info("初始化数据源连接..");
        Reader resourceAsReader = Resources.getResourceAsReader("MyBatisConfigure.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSessionUtils.bindSqlSessionFactory(sqlSessionFactory);
        logger.info("初始化控制器..");
        Reflections reflections = new Reflections(properties.getProperty("controller.package"));
        Set<Class<?>> controllers = reflections.getTypesAnnotatedWith(NettyRestController.class);
        logger.info("发现控制器数量:{}",controllers.size());
        GlobalController.setInstance(controllers);
        for (Class<?> controller : controllers) {
            GlobalController.putInstanceMethods(controller,controller.getDeclaredMethods());
        }
        logger.info("初始化控制器方法完成..");
        logger.info("初始化注入器");
        Injector injector = Guice.createInjector(new GModel());
        ServiceInjector.bindInjector(injector);
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup,workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childOption(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT)
                    .childHandler(new NioWebSocketChannelInit());
            ChannelFuture f = serverBootstrap.bind(port).sync();
            f.channel().closeFuture().sync();
        }catch (Exception ex){
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }

    }
}
