package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 * ���๦����ϵͳ
 */
public class SamSungCamera implements Camera{
    @Override
    public void open() {
        System.out.println("�����");
    }

    @Override
    public void takePicture() {
        System.out.println("����");
    }

    @Override
    public void close() {
        System.out.println("�ر����");
    }
}
