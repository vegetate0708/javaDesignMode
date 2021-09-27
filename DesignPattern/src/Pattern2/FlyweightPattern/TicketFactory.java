package Pattern2.FlyweightPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 〈享元工厂类〉
 *
 * @author vegetate
 * @create 2018/11/9 14:56
 */

public class TicketFactory {
    static Map<String, Ticket> map = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + to;
        if (map.containsKey(key)) {
            System.out.println("使用缓存查询" + key);
            return map.get(key);
        } else {
            System.out.println("创建对象查询" + key);
            Ticket ticket = new ConcreteTicket(from, to);
            map.put(key, ticket);
            return ticket;
        }
    }
}