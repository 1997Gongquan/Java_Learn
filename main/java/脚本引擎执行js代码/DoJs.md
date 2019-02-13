# <center>脚本引擎执行javaScript代码
* java脚本引擎是从jdk6.0之后添加的新功能
* 脚本引擎介绍：
    * 使得java应用程序可以通过一套固定的接口和各种脚本引擎交互，从而达到在java品台上调用各种脚本语言的目的
    * java脚本API是链接Java品台和脚本语言的桥梁
    * 可以把一些复杂易变的业务逻辑交给脚本语言处理。
* 获得脚本引擎对象
```
ScriptEngineManager sem=new ScriptEngineManager();
ScriptEngine engine=sem getEngineByName("javaScript");
```
* Java脚本API为开发者提供了如下功能：
    * 获取脚本程序输入，通过脚本引擎运行脚本并返回结果。Java可以通过对各种不同的实现，从而通用的调用js、groovy、python等脚本
        * js使用了Rhino。是一种使用java语言编写的JavaScript的开源实现，原先由Mozilla开发，后被集成到jdk6.0中
    * 通过脚本引擎的运行上下文脚本和java品台之间交换数据
    * 通过java应用程序调用脚本函数