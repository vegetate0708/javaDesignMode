package FacadePattern;

/**
 * Created by lx on 2018/9/29.
 * 照相功能子系统
 */
public class SamSungCamera implements Camera{
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
