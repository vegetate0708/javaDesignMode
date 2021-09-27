package Pattern2.ProxyPattern;

import java.lang.reflect.Proxy;

/**
 * Created by lx on 2018/9/28.
 */
public class ProxyTest1 {
    public static void main(String[] args) {  // TODO Auto-generated method stub
        People people_1 = new People();
        people_1.setCash(40000);
        people_1.setUsername("jeck");
        people_1.setVip("0");

        Buy_CarHandler handler = new Buy_CarHandler();
        handler.setObject(people_1);
        Buy_car people = (Buy_car) Proxy.newProxyInstance(Buy_car.class.getClassLoader(), new Class[]{Buy_car.class}, handler);
        people.buy_car();

        People people_2 = new People();
        people_2.setCash(60000);
        people_2.setUsername("rose");
        people_1.setVip("0");
        handler.setObject(people_2);
        Buy_car people2 = (Buy_car) Proxy.newProxyInstance(Buy_car.class.getClassLoader(), new Class[]{Buy_car.class}, handler);
        people2.buy_car();

        People people_3 = new People();
        people_3.setCash(0);
        people_3.setUsername("tom");
        people_3.setVip("vip");
        handler.setObject(people_3);
        Buy_car people3 = (Buy_car) Proxy.newProxyInstance(Buy_car.class.getClassLoader(), new Class[]{Buy_car.class}, handler);
        people3.buy_car();
    }
}
