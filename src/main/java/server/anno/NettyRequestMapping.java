package server.anno;

import server.NettyRequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @author yujian
 * @email 754369677@qq.com
 * 请求路径映射注解，可以配置请求方式
 */
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NettyRequestMapping {
    String value() default "";
    NettyRequestMethod[] method() default {};
}
