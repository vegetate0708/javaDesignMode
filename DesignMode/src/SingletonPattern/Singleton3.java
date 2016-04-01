package SingletonPattern;
/*利用双重检查加锁(double-checked locking) 首先检查是否实例已经创建了，如果
 * 尚未创建，“才”进行同步。这样一来，只有第一次会同步。 
 * 
 */
public class Singleton3 {
	
	/*
	 * volatile关键词确保：当uniqueInstance变量被初始化成Singleton实例时，多个线程正确的处理uniqueInstance变量
	 */
	private volatile static Singleton3 uniqueInstance; //利用一个静态变量来记录SingleTon类的唯一实例
	 private Singleton3(){}   //构造方法私有化，只有Singleton类内才可以调用构造器
	 public static Singleton3 getInstance(){  //使用getInstance方法实例化对象，并返回这个实例
		 if(uniqueInstance==null){//检查实例，只有不存在才进入同步块
			 synchronized (Singleton3.class) {//只有第一次才彻底执行这里的代码
				if (uniqueInstance==null) {//进入区块后，再检查一次，如果仍然为null，才创建实例
					uniqueInstance=new Singleton3();
				}
			}
		 }
		 return uniqueInstance;
	 }
}
