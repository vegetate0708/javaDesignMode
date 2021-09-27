package Pattern1.SingletonPattern;

/*
 * ͨ�����������Ƶ�getInstance�����У�������ʹÿ���߳��ڽ����������֮ǰ��
 * Ҫ�ȵȴ�����߳��뿪�ķ�����Ҳ����˵�����������߳�ͬʱ�������������
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance; //����һ����̬��������¼SingleTon���Ψһʵ��

    private Singleton2() {
    }   //���췽��˽�л���ֻ��Singleton���ڲſ��Ե��ù�����

    public static synchronized Singleton2 getInstance() {  //ʹ��getInstance����ʵ�������󣬲��������ʵ��
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
