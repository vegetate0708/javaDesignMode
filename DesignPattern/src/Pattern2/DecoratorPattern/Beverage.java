package Pattern2.DecoratorPattern;

/*
 * create by xuefu 2016/2/18
 * ��������������Լ����ϵĻ���
 * ������
 */
public abstract class Beverage {
    String description = "Unknow Beverage";
    int size;
    public static int TALL = 1;
    public static int GRANDE = 2;
    public static int VENTI = 3;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract int getSize();

    public void setSize(int i) {
        this.size = i;
    }

    ;
}
