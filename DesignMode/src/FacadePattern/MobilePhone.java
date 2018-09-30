package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 * 外观者
 */
public class MobilePhone {
    private Phone mPhone=new PhoneImpl();
    private Camera mCamera=new SamSungCamera();
    //打电话
    public void dail(){
        mPhone.dail();
    }
    //视频聊天
    public void videoChat(){
        System.out.println("--->视频聊天通话中");
        mCamera.open();
        mPhone.dail();
    }

    public void hangUp(){
        mPhone.hangup();
    }
    //拍照
    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
    }
    public void closeCamera(){
        mCamera.close();
    }
}
