package Pattren1.SingletonPattern;
/*
 * ���Ӧ�ó������Ǵ�����ʹ�õ���ʵ���������ڴ��������з���ĸ�����̫���أ����Կ���ʹ�ü��д����˵���
 */
public class Singleton1 {
	private static Singleton1 uniqueInstance=new Singleton1(); //�ھ�̬��ʼ�����д���SingleTon���Ψһʵ��
	 private Singleton1(){}   //���췽��˽�л���ֻ��Singleton���ڲſ��Ե��ù�����
	 public static Singleton1 getInstance(){  //ʹ��getInstance����ʵ�������󣬲��������ʵ��
		 return uniqueInstance;
	 }
}
