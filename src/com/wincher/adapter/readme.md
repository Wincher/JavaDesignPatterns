
## adapter methode describe
>在阎宏博士的《JAVA与模式》一书中开头是这样描述适配器（Adapter）模式的：
　适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。

　　工厂方法模式的用意是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中。

>##### test中是在[《JAVA 与模式》之适配器模式](http://www.cnblogs.com/java-my-life/archive/2012/04/13/2442795.html/)
>>  *借用文中的话*
适配器模式的用途
　　用电器做例子，笔记本电脑的插头一般都是三相的，即除了阳极、阴极外，还有一个地极。
而有些地方的电源插座却只有两极，没有地极。
电源插座与笔记本电脑的电源插头不匹配使得笔记本电脑无法使用。
这时候一个三相到两相的转换器（适配器）就能解决此问题，而这正像是本模式所做的事情。
适配器模式的结构
　　适配器模式有类的适配器模式和对象的适配器模式两种不同的形式。
模式所涉及的角色有：
　　●　　目标 (Target) 角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
　　●　　源 (Adapee) 角色：现在需要适配的接口。
　　●　　适配器 (Adaper) 角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
1.适配器模式的优点
　　更好的复用性
　　系统需要使用现有的类，而此类的接口不符合系统的需要。那么通过适配器模式就可以让这些功能得到更好的复用。
　　更好的扩展性
　　在实现适配器功能的时候，可以调用自己开发的功能，从而自然地扩展系统的功能。
2.适配器模式的缺点
　　过多的使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。