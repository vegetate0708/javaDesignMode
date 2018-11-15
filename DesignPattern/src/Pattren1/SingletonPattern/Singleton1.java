package Pattren1.SingletonPattern;
/*
 * 如果应用程序总是创建并使用单件实例，或者在创建和运行方面的负担不太繁重，可以考虑使用急切创建此单例
 */
public class Singleton1 {
	private static Singleton1 uniqueInstance=new Singleton1(); //在静态初始化器中创建SingleTon类的唯一实例
	 private Singleton1(){}   //构造方法私有化，只有Singleton类内才可以调用构造器
	 public static Singleton1 getInstance(){  //使用getInstance方法实例化对象，并返回这个实例
		 return uniqueInstance;
	 }
}
