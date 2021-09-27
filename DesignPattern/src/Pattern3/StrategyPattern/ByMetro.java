package Pattern3.StrategyPattern;

/**
 * 〈具体策略类，以坐地铁上班为例〉
 *
 * @author vegetate
 * @create 2018/11/9 15:14
 */

public class ByMetro implements Strategy {

    @Override
    public void operate() {
        System.out.println("坐地铁去上班");
    }
}