# <center>反射（reflection）
*  1、反射机制
*  2、动态编译
*  3、动态编写javaScript代码
*  4、动态字节码操作
    * 动态语言
        * 程序运行时，可以改变程序结构或者变量类型，典型的语言：
            * Pathon、ruby、javaScripts等
            * 如下JavaScripts代码
            ```
                function test(){
                    var a="var a=3;var b=5;alert(a+b);"
                    eval(a);
                }
            ```
    * C、C++、JAVA不是动态语言，但是JAVA具有一定的动态性，我们可以利用反射机制，字节码操作获得类似动态语言的特性
## 一、反射机制
* 指的是可以与运行时加载，弹指，使用编译期间完全未知的类。
* 程序在运行状态中，可以动态加载一个只有名称的类，对于任意一个已加载的类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；
    ```
    Class c=Class.forName("类路径")
    ```
* 加载完类后，在堆内存中，就产生了一个Class类型的对象（一个类只有一个CLass对象），这个对象就包含了完整的类的结构信息。我们可以通过这个对象看到类的结构。这个对象就像一面镜子，透过这个镜子看到类的结构，所以，我们称之为：反射
* 反射机制性能问题
    * setAccessible
        * 禁用安全检查的开关，将会提高反射的运行速度
    * 可以考虑使用：cglib/javaassit字节码操作
* 反射操作泛型
    * java采用泛型擦除的机制引入泛型，java中的泛型仅仅是编译器Javac使用的，确保数据的安全性和免去强制类型装换的麻烦，但是，一旦编译完成，所有的和泛型有关的类型全部擦除
    * java采用反射操作这些类型以迎合开发的需要，java新增了ParameterizedType，GenericArrayType,TypeVariable和WildcardType几种类型来代表不能被诡异到class类中的类型但是有和原始类型齐名的类型。
    ```
    ParameterizedType表示一中参数化的类型，比如Collection<String>
    GenericArrayType表示一种元素类型是参数化类型或者类型变量的数组类型
    TypeVariable是各种类型变量的公共父接口
    WildcardTyped代表一种通配符类型表达式，比如？，？extend是Number,? super Interger
    ```