# <center>JAVA字节码操作
* Java动态性的两种实现方式
    * 字节码操作
    * 反射
* 运行时操作字节码可以让我们实现如下功能
    * 动态生成新的类
    * 动态改变某个类的结构（添加、删除、修改  新的属性、方法）
* 优势
    * 比反射开销小，性能高
    * JavaAsist性能高于反射，低于ASM
* 常见字节码操作类库
    * BCEL-----Byte Code Engineer Library(BCEL)，这是Apache SoftWare Foundation的Jakarta项目的一部分，BCEL是Java classWorking广泛使用的一种框架，他让我们深入JVM汇编语言进行类操作的细节。BCEL与Javasssist有不同的处理字节码方法，BCEL在袭击的JVM指令层次上进行操作（BCEL拥有丰富的JVM指令级支持），而javassist所强调的是源代码级别的工作
    * ASM-----一个轻量级的java字节码操作框架，直接涉及到JVM底层的指令和操作
    * CGLIB-----Code Geneeration Library,是一个强大的，高性能的Code生成类库，给予ASM实现
    * Javassisit-----是一个开源的分析、编辑、和创建java字节码的类库，性能较ASM差，和cgblib差不多，但是使用简单