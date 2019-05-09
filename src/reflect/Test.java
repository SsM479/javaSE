package reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解
 * Retention 用于声明注解的存在范围
 * @author soft01
 *
 */
/*
 * RUNTIME:源代码->字节码->方法区
 * SOURCE:源代码
 * CLASS：源代码->字节码
 * 默认为CLASS  通常使用RUNTIME  
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

}
