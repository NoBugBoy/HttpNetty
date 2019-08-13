package server.anno;

import server.NettyRequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface NettyRequestMapping {
    String value() default "";
    NettyRequestMethod[] method() default {};
}