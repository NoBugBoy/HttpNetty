package server.anno;

import java.lang.annotation.*;

@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface NettyRequestParam {
    String value();
    boolean required() default true;
    String defaultValue() default "";
}
