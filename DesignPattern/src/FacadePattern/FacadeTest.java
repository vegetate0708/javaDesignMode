package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 */
public class FacadeTest {
    public static void main(String[] s){
        //�������
        MobilePhone mobilePhone=new MobilePhone();
        //�ͻ��������ա��������죬ֱ�ӵ������գ�����֪����ϵͳ��ν�����
        mobilePhone.takePicture();
        mobilePhone.videoChat();
    }
}
