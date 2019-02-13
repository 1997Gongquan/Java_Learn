package 动态编译;


import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test01 {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        String dir="E:/HelloWorld.java";
        JavaCompiler compiler= ToolProvider.getSystemJavaCompiler();
        int result=compiler.run(null,null,null,dir);
        System.out.println(result==0?"编译成功":"编译失败");

//        Runtime run=Runtime.getRuntime();
//        Process process=run.exec("java E:/ HelloWorld");
//        InputStream in=process.getInputStream();
//        BufferedReader reader=new BufferedReader(new InputStreamReader(in));
//        String info="";
//        while((info=reader.readLine())!=null){
//            System.out.println(info);
//        }
        URL[] urls=new URL[]{new URL("FILE:/E:/")};
        URLClassLoader loader=new URLClassLoader(urls);


        //加载该类时存在错误，无法在运行时找到该类，但前面编译时又没有问题。。。
        Class c=loader.loadClass("HelloWorld");
        //调用加载类的main方法
        c.getMethod("main",String[].class).invoke("null",(Object)new String[]{});

    }
}
