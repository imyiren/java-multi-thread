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
 
- 关于synchronized(非this对象x) 格式写法是将x对象本身作为"对象监视器"，这样就可以得出一下3个结论
 1. 当多个线程同时执行synchronized(x){}同步代码块呈同步效果
 2. 当其他线程执行x对象中synchronized同步方法时呈同步效果
 3. 当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果。
 但是需要注意：如果其他线程调用不加synchronized关键字的方法时，还是异步调用。
 
- 查看线程死锁状态 
 1. jps 找到运行的程序 然后jstack -l id 查看死锁信息。

- volatile关键字增加了实例变量在多个线程之间的可见性，但volatile关键字最致命的缺点是不支持原子性
 1. 关键字volatile是线程同步的轻量级实现，所以volatile性能肯定比synchronized要好，并且volatile只能修饰语变量，而synchronized可以修饰方法，以及代码块。随着JDK新版本的发布，synchronized关键字在执行效率上得到了很大提升，在开发中使用synchronized关键字的比率还是要比较大的
 2. 多线程访问volatile不会发生阻塞，而synchronized会出现阻塞。
 3. volatile能保证数据的可见性，但不能保证原子性； 而synchronized可以保证原子性，也可以间接保证可见性，因为它会将私有内存的和公共内存中的数据做同步。
 4. 关键字volatile解决的是变量在多个线程间的可见性。而synchronized关键字解决的是多个线程之间访问资源的同步性。
 
 线程安全包含原子性和可见性两个方面，Java的同步机制都是围绕这两个方面来确定线程的安全的。