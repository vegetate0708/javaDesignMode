package Pattern2.BridgePattern;

/**
 * Created by lx on 2018/11/7.
 */
public abstract class IPhone {
    protected Brand brand;
    protected Software softWare;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Software getSoftWare() {
        return softWare;
    }

    public void setSoftWare(Software softWare) {
        this.softWare = softWare;
    }

    // �����ʵ�ֽ���ʵ�ֲ��ִ���
    public void run() {
        softWare.run();
    }

    // �����ʵ�ֽ���ʵ�ֲ��ִ���
    public void showBrand() {
        brand.brand();
    }

    //����ķ����������̳�ʵ��
    public abstract void setON();

}