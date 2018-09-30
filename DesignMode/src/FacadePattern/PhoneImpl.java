package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 * 电话功能子系统
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }
}
