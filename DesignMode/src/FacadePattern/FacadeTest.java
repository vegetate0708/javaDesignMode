package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 */
public class FacadeTest {
    public static void main(String[] s){
        //创建外观
        MobilePhone mobilePhone=new MobilePhone();
        //客户端想拍照、视屏聊天，直接调用拍照，不用知道子系统如何交互的
        mobilePhone.takePicture();
        mobilePhone.videoChat();
    }
}
