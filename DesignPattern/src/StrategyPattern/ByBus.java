package StrategyPattern;

/**
 * 〈具体策略类，以上班坐公交为例〉
 *
 * @author vegetate
 * @create 2018/11/9 15:12
 */

public class ByBus implements Strategy {
    @Override
    public void operate() {
        // TODO Auto-generated method stub
        System.out.println("坐公交车去上班");
    }
}