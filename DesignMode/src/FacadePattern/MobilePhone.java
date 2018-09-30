package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 * �����
 */
public class MobilePhone {
    private Phone mPhone=new PhoneImpl();
    private Camera mCamera=new SamSungCamera();
    //��绰
    public void dail(){
        mPhone.dail();
    }
    //��Ƶ����
    public void videoChat(){
        System.out.println("--->��Ƶ����ͨ����");
        mCamera.open();
        mPhone.dail();
    }

    public void hangUp(){
        mPhone.hangup();
    }
    //����
    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
    }
    public void closeCamera(){
        mCamera.close();
    }
}
