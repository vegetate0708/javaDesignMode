package Pattern3.StatePattern;

/**
 * Created by lx on 2017/8/22.
 * С����
 */
public class CarPowerOnState implements CarState {
    @Override
    public void upSpeed() {
        System.out.println("С����������");
    }

    @Override
    public void downSpeed() {
        System.out.println("С����������");
    }

    @Override
    public void turnOnLight() {
        System.out.println("С�����򿪳�����");
    }

    @Override
    public void turnDownLight() {
        System.out.println("С�����رճ�����");
    }
}
