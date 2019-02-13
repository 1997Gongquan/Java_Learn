package 注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/*
 *使用反射读取注解内容
 */
public class Read {
    Class clazz = Student.class;

    public void test(){
        System.out.println(Student.class);

        //获取类的所有有效注解
        Annotation[] annotations=clazz.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }

        //获取类的指定注解
        Table table=(Table) clazz.getAnnotation(Table.class);
        System.out.println(table.value());

        //获得类的属性的注解
        try {

            Field f1=clazz.getDeclaredField("name");
            Annotation annotation1=f1.getAnnotation(注解.Field.class);
            System.out.println(((注解.Field) annotation1).columnName()+"---------"+((注解.Field) annotation1).type()+"-----------"+((注解.Field) annotation1).length());

            Field f2=clazz.getDeclaredField("age");
            Annotation annotation2=f2.getAnnotation(注解.Field.class);
            System.out.println(((注解.Field) annotation2).columnName()+"---------"+((注解.Field) annotation2).type()+"-----------"+((注解.Field) annotation2).length());

            Field f3=clazz.getDeclaredField("id");
            Annotation annotation3=f3.getAnnotation(注解.Field.class);
            System.out.println(((注解.Field) annotation3).columnName()+"---------"+((注解.Field) annotation3).type()+"-----------"+((注解.Field) annotation3).length());


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
