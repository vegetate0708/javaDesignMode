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

    // 具体的实现交给实现部分处理
    public void run() {
        softWare.run();
    }

    // 具体的实现交给实现部分处理
    public void showBrand() {
        brand.brand();
    }

    //抽象的方法，留给继承实现
    public abstract void setON();

}