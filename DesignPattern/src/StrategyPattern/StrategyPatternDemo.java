package StrategyPattern;

/**
 * �������ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 15:17
 */

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context;
        System.out.println("----------ʱ������������Ƚϱ���---------------");
        context = new Context(new ByBus());
        context.operate();
        System.out.println("\n");

        System.out.println("----------ʱ�䲻����ѡ���������ȽϿ���---------------");
        context.setStrategy(new ByMetro());
        context.operate();
    }
}