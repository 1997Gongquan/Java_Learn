package 字节码操作;

import javassist.*;

import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
        //获取一个默认的类池
        ClassPool pool=ClassPool.getDefault();
        CtClass cs=pool.makeClass("EmpNew");

        //创建属性
        cs.addField(CtField.make("private int empno;",cs));
        cs.addField(CtField.make("private String ename;",cs));

        //创建方法
        cs.addMethod(CtMethod.make("public int getEmpno(){return empno;}",cs));
        cs.addMethod(CtMethod.make("public void setEmpno(int empno){this.empno=empno;}",cs));

        //添加构造器
        CtConstructor constructor=new CtConstructor(new CtClass[]{CtClass.intType,pool.get("java.lang.String")},cs);
        constructor.setBody("{this.empno=$1;this.ename=$2;}");
        cs.addConstructor(constructor);
        //将上面构造好的类写入到Myjava文件夹中
        cs.writeFile("E:/Learn/IDE/IDEA/IDEA_Projects/Annotation_java/src/main/java/字节码操作");
    }
}
