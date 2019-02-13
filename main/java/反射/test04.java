package 反射;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 *反射机制性能测试
 */
public class test04 {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int times=1000000000;
        Student student=new Student();
        long startTime=System.currentTimeMillis();
        for(int i=0;i<times;i++){
            student.getAge();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("普通方法调用方法耗时："+(endTime-startTime)+"ms");

        Class clazz=Student.class;
        Method method=clazz.getDeclaredMethod("getAge");
        startTime=System.currentTimeMillis();
        for(int i=0;i<times;i++){
            method.invoke(student,null);
        }
        endTime=System.currentTimeMillis();
        System.out.println("反射方法调用方法耗时："+(endTime-startTime)+"ms");

        Class clazz1=Student.class;
        Method method1=clazz.getDeclaredMethod("getAge");
        startTime=System.currentTimeMillis();
        method1.setAccessible(true);
        for(int i=0;i<times;i++){
            method1.invoke(student,null);
        }
        endTime=System.currentTimeMillis();
        System.out.println("取消安全检查，反射方法调用方法耗时："+(endTime-startTime)+"ms");

    }
}
