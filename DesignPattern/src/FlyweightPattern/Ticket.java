package FlyweightPattern;

/**
 * 〈抽象享元类〉
 *
 * @author vegetate
 * @create 2018/11/9 14:54
 */

public interface Ticket{
    //显示票价，参数为列车类型
    public void showPrice(String type);
}