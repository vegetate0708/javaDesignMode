package StrategyPattern;

/**
 * 〈测试类〉
 *
 * @author vegetate
 * @create 2018/11/9 15:17
 */

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context;
        System.out.println("----------时间充足坐公交比较便宜---------------");
        context = new Context(new ByBus());
        context.operate();
        System.out.println("\n");

        System.out.println("----------时间不够了选择坐地铁比较靠谱---------------");
        context.setStrategy(new ByMetro());
        context.operate();
    }
}