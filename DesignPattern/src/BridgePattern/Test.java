package BridgePattern;

/**
 * Created by lx on 2018/11/7.
 */
public class Test {
    public static void main(String[] args) {
        IPhone phone = new Phone();
        phone.setBrand(new Nokia());
        phone.showBrand();
        phone.setON();
        phone.setSoftWare(new Game());
        phone.run();
        phone.setSoftWare(new Camera());
        phone.run();
        System.out.println("--------------");
        phone.setBrand(new MotoRola());
        phone.showBrand();
        phone.setON();
        phone.setSoftWare(new Game());
        phone.run();
        phone.setSoftWare(new Camera());
        phone.run();
    }
}
