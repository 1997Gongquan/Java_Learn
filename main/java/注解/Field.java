package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)

//能够通过反射读取到该注解
@Retention(RetentionPolicy.RUNTIME)
//修饰属性
public @interface Field {
    String columnName();
    String type();
    int length();
}
