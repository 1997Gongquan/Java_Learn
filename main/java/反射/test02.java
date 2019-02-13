package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *应用反射API，获取类的结构信息（类的属性、名字、方法、构造器等）
 */
public class test02 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class clazz=Student.class;
        //获得包名加类名
        System.out.println(clazz.getName());
        //获得类名
        System.out.println(clazz.getSimpleName());
        //获取属性
        Field[] fields=clazz.getFields();//只能获取public
        Field[] fields1=clazz.getDeclaredFields();//获得所有属性
        Field field2=clazz.getDeclaredField("name");//获得特定属性
        System.out.println(fields.length);

        //获取方法
        Method[] methods=clazz.getMethods();
        Method method=clazz.getDeclaredMethod("test",int.class);//如果有参数，就传递对应的参数class对象
        for (Method m:methods){
            System.out.println("方法"+m);
        }
        //获取构造器
        Constructor[] constructors=clazz.getConstructors();
        Constructor constructor=clazz.getConstructor(int.class);
        for (Constructor c:constructors){
            System.out.println("构造器"+c);
        }

    }
}
