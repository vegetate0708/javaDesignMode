package StatePattern;

/**
 * Created by lx on 2017/8/22.
 * 小汽车熄火状态，不能加速，不能开车灯
 */
public class CarPowerOffState implements CarState {
    @Override
    public void upSpeed() {
        System.out.println("小汽车熄火状态中，无法加速");
    }

    @Override
    public void downSpeed() {

    }

    @Override
    public void turnOnLight() {
        System.out.println("小汽车熄火状态中，无法开灯");
    }

    @Override
    public void turnDownLight() {

    }
}
