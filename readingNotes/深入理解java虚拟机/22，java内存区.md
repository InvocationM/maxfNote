# 运行时数据区
    线程共享区：方法区，java堆
    线程独占区：虚拟机栈，本地方法栈，程序计数器
    执行引擎
    本地库接口
    本地方法区
    
程序计数器：当前线程所执行的字节码的行号指示器。
    通过改变计数器的值来选取下一条需要执行的字节码指令，分支，循环，跳转，异常处理，线程恢复等基础功能都需要依赖这个计数器来完成。
     
虚拟机栈：生命周期和线程相同。每条线程执行的时候都会创建一个栈帧，用于存储局部变量表，操作数栈，动态链接，方法出口等信息。
 
本地方法栈：用来执行本地方法。 在Sun HotSpot中与虚拟机栈合一了。

java堆：jvm所管理的内存最大的一块区域。被所有线程共享，在虚拟机启动时候创建。此内存区的唯一目的就是存放对象实例。

方法区：（Non-Heap）是所有线程共享的区域。它用来存储虚拟机加载过的类信息，静态变量，常量，即时编译器编译后的代码数据等等。

###### 运行时常量：是方法区的一部分。具备动态性，在运行时，也可以有新的常量被放入池中。