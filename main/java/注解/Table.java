package 注解;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)

//能够通过反射读取到该注解
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}
