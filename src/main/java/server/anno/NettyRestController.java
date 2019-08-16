package server.anno;

import java.lang.annotation.*;

/**
 * @author yujian
 * @email 754369677@qq.com
 * 写在controller包内的类上,证明是一个控制器
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NettyRestController {
    String value() default "";
}
