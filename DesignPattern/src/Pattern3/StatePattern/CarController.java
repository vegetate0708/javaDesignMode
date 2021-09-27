package Pattern3.StatePattern;

/**
 * Created by lx on 2017/8/22.
 */
public class CarController implements PowerController {
    CarState carState;

    public void setCarState(CarState carState) {
        this.carState = carState;
    }

    @Override
    public void poweron() {
        setCarState(new CarPowerOnState());
        System.out.println("小汽车启动了。。。");
    }

    @Override
    public void poweroff() {
        setCarState(new CarPowerOffState());
        System.out.println("小汽车熄火了。。。");
    }

    public void upSpeed() {
        carState.upSpeed();
    }


    public void downSpeed() {
        carState.downSpeed();
    }


    public void turnOnLight() {
        carState.turnOnLight();
    }


    public void turnDownLight() {
        carState.turnDownLight();
    }
}
