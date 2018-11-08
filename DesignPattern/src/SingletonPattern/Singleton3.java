package SingletonPattern;
/*����˫�ؼ�����(double-checked locking) ���ȼ���Ƿ�ʵ���Ѿ������ˣ����
 * ��δ���������š�����ͬ��������һ����ֻ�е�һ�λ�ͬ���� 
 * 
 */
public class Singleton3 {
	
	/*
	 * volatile�ؼ���ȷ������uniqueInstance��������ʼ����Singletonʵ��ʱ������߳���ȷ�Ĵ���uniqueInstance����
	 */
	private volatile static Singleton3 uniqueInstance; //����һ����̬��������¼SingleTon���Ψһʵ��
	 private Singleton3(){}   //���췽��˽�л���ֻ��Singleton���ڲſ��Ե��ù�����
	 public static Singleton3 getInstance(){  //ʹ��getInstance����ʵ�������󣬲��������ʵ��
		 if(uniqueInstance==null){//���ʵ����ֻ�в����ڲŽ���ͬ����
			 synchronized (Singleton3.class) {//ֻ�е�һ�βų���ִ������Ĵ���
				if (uniqueInstance==null) {//����������ټ��һ�Σ������ȻΪnull���Ŵ���ʵ��
					uniqueInstance=new Singleton3();
				}
			}
		 }
		 return uniqueInstance;
	 }
}
