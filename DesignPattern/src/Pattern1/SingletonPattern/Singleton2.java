package Pattern1.SingletonPattern;

/*
 * 通过增加锁机制到getInstance方法中，我们迫使每个线程在进入这个方法之前，
 * 要先等待别的线程离开改方法，也就是说不会有两个线程同时进入这个方法。
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance; //利用一个静态变量来记录SingleTon类的唯一实例

    private Singleton2() {
    }   //构造方法私有化，只有Singleton类内才可以调用构造器

    public static synchronized Singleton2 getInstance() {  //使用getInstance方法实例化对象，并返回这个实例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
