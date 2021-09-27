package Pattern2.FlyweightPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ����Ԫ�����ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 14:56
 */

public class TicketFactory {
    static Map<String, Ticket> map = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + to;
        if (map.containsKey(key)) {
            System.out.println("ʹ�û����ѯ" + key);
            return map.get(key);
        } else {
            System.out.println("���������ѯ" + key);
            Ticket ticket = new ConcreteTicket(from, to);
            map.put(key, ticket);
            return ticket;
        }
    }
}