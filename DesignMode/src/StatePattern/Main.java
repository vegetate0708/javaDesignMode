package StatePattern;

/**
 * Created by lx on 2017/8/22.
 */
public class Main {
    public static  void main(String[] s){
        CarController carController=new CarController();
        carController.setCarState(new CarPowerOnState());//С����������
        carController.turnOnLight();
        carController.poweroff();//С����Ϩ����
        carController.turnOnLight();
    }
}
