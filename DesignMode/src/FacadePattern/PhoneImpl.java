package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 * �绰������ϵͳ
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("��绰");
    }

    @Override
    public void hangup() {
        System.out.println("�Ҷϵ绰");
    }
}
