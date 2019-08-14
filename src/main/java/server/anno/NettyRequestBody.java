package server.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @author yujian
 * @email 754369677@qq.com
 * JSON请求方式，将请求内容映射到对象上
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface NettyRequestBody {
    boolean required() default true;
}
