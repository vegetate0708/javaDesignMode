package SingletonPattern;

/**
 * Created by  on 2017/8/21.vegetate
 * ��̬�ڲ��࣬ʵ�����̰߳�ȫ���ֱ�����ͬ������������Ӱ�졣
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
