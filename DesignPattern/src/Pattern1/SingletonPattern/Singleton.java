package Pattern1.SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance; //����һ����̬��������¼SingleTon���Ψһʵ��

    private Singleton() {
    }   //���췽��˽�л���ֻ��Singleton���ڲſ��Ե��ù�����

    public static Singleton getInstance() {  //ʹ��getInstance����ʵ�������󣬲��������ʵ��
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
