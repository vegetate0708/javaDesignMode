package Pattern2.FlyweightPattern;

/**
 * 〈测试类〉
 *
 * @author vegetate
 * @create 2018/11/9 14:57
 */
public class Test {
    public static void main(String[] args) {
        TicketFactory.getTicket("南京", "杭州").showPrice("Gaotie");
        TicketFactory.getTicket("南京", "杭州").showPrice("Dongche");
    }

}