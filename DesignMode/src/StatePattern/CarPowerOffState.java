package StatePattern;

/**
 * Created by lx on 2017/8/22.
 * С����Ϩ��״̬�����ܼ��٣����ܿ�����
 */
public class CarPowerOffState implements CarState {
    @Override
    public void upSpeed() {
        System.out.println("С����Ϩ��״̬�У��޷�����");
    }

    @Override
    public void downSpeed() {

    }

    @Override
    public void turnOnLight() {
        System.out.println("С����Ϩ��״̬�У��޷�����");
    }

    @Override
    public void turnDownLight() {

    }
}
