package Pattern2.FlyweightPattern;

/**
 * �������ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 14:57
 */
public class Test {
    public static void main(String[] args) {
        TicketFactory.getTicket("�Ͼ�", "����").showPrice("Gaotie");
        TicketFactory.getTicket("�Ͼ�", "����").showPrice("Dongche");
    }

}