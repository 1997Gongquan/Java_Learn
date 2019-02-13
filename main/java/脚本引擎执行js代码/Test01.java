package 脚本引擎执行js代码;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 *测试js脚本引擎
 */
public class Test01 {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        //获得脚本引擎对象
        ScriptEngineManager sem=new ScriptEngineManager();
        ScriptEngine engine=sem.getEngineByName("nashorn");

        //定义变量
//        engine.put("msg","gongquan is cool");

        String str="var user={" +
                "name:'gongquan'," +
                "age:20, "+
                "school:'重庆理工大学'" +
                "};";
        str+="print(user.name);";
        //执行脚本
        engine.eval(str);

        //定义函数
        engine.eval("function add(a,b){" +
                "var sum=a+b;" +
                "return sum;" +
                "}");
        //执行js函数
        Invocable jsInvoke= (Invocable) engine;
        Object object=jsInvoke.invokeFunction("add",new Object[]{13,20});
        System.out.println(objec
                t);
    }
}
