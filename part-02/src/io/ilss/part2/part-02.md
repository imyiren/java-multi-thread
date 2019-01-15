##### 多个线程调用同一个对象中的不同名称的synchronized同步方法或者synchronized(this)同步代码块时，调用的效果就是按顺序执行，也就是同步的，阻塞的
##### 这说明synchronized同步方法或synchronized(this)同步代码块分别有两种作用
- synchronized同步方法
 1. 对其他的同步方法或者this同步代码块调用阻塞
 2. 同一时间只有一个县城可以执行synchronized同步方法中的代码。
- synchronized(this)同步代码块
 1. 对其他synchronized同步方法或synchronized(this)同步代码块调用阻塞
 2. 在同一时间只有一个县城可以执行synchronized(this)同步代码块中的代码

- Java支持"任意对象"作为"对象监视器"来实现同步功能，任意对象 大多数是实例变量以及方法的参数，使用格式是synchronized(非this对象)
 1. 在多个线程持有"对象监视器"为同一个对象的前提下，同一时间只有一个线程可以执行synchronized(非this对象x)同步代码块中的代码
 2. 当持有"对象监视器"为同一个对象的前提下，同一时间只有一个线程可以执行synchronized(非this对象x)同步代码块中的代码
 