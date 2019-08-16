package server.anno;

import server.NettyRequestMethod;

import java.lang.annotation.*;

/**
 * @author yujian
 * @email 754369677@qq.com
 * 请求路径映射注解，可以配置请求方式
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NettyRequestMapping {
    String value() default "";
    NettyRequestMethod[] method() default {};
}
