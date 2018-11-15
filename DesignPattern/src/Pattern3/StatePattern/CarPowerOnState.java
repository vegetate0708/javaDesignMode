package Pattern3.StatePattern;

/**
 * Created by lx on 2017/8/22.
 * 小汽车
 */
public class CarPowerOnState implements CarState {
    @Override
    public void upSpeed() {
        System.out.println("小汽车加速了");
    }

    @Override
    public void downSpeed() {
        System.out.println("小汽车减速了");
    }

    @Override
    public void turnOnLight() {
        System.out.println("小汽车打开车灯了");
    }

    @Override
    public void turnDownLight() {
        System.out.println("小汽车关闭车灯了");
    }
}
