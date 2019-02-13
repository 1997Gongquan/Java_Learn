package 注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)

//能够通过反射读取到该注解
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation01 {

    String studentName() default "龚权";
    int age() default 20;
    String[] schools() default {"重庆理工大学","清华大学"};

}
