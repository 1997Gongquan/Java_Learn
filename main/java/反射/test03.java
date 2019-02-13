package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 *通过反射API操作方法、构造器
 */
public class test03 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class clazz=Student.class;

        //调用构造器
        Student student=(Student) clazz.newInstance();

        Constructor<Student> constructor=clazz.getConstructor(int.class);

        Student student1=constructor.newInstance(10);

        //调用普通方法
        Method method=clazz.getDeclaredMethod("test",int.class);
        method.invoke(student,100);
        System.out.println(student.age);

        //操作属性
        Field field=clazz.getDeclaredField("age");
        field.set(student,99);
        System.out.println(student.age);//调用私有属性将会报错
        field.setAccessible(true);//取消安全检查，将可以调用私有属性
    }
}
