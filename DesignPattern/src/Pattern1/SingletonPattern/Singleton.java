package Pattern1.SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance; //利用一个静态变量来记录SingleTon类的唯一实例

    private Singleton() {
    }   //构造方法私有化，只有Singleton类内才可以调用构造器

    public static Singleton getInstance() {  //使用getInstance方法实例化对象，并返回这个实例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
