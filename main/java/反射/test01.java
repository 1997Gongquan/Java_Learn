package 反射;

import sun.reflect.generics.scope.ClassScope;

//测试Class对象的获取
public class test01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        String path="反射.Student";
//        获取Class类的方法
//        Class clazz=Student.class;
//        Class clazz=path.getClass();
//        Class clazz=Class.forName(path);
//        System.out.println(clazz.hashCode());
//
//        Class clazz2=Class.forName(path);
//        System.out.println(clazz2.hashCode());


        int[] arr01=new int[1];
        int[] arr02=new int[2];
        int[][] arr03=new int[3][3];
        System.out.println(arr01.getClass().hashCode());
        System.out.println(arr02.getClass().hashCode());
        System.out.println(arr03.getClass().hashCode());
        System.out.println(arr03[0].getClass().hashCode());

    }
}
