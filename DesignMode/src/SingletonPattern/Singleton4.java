package SingletonPattern;

/**
 * Created by  on 2017/8/21.vegetate
 * 静态内部类，实现了线程安全，又避免了同步带来的性能影响。
 */
public class Singleton4 {
    private static class LazyHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4 (){}
    public static final Singleton4 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
