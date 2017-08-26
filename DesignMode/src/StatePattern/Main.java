package StatePattern;

/**
 * Created by lx on 2017/8/22.
 */
public class Main {
    public static  void main(String[] s){
        CarController carController=new CarController();
        carController.setCarState(new CarPowerOnState());//小汽车启动了
        carController.turnOnLight();
        carController.poweroff();//小汽车熄火了
        carController.turnOnLight();
    }
}
