package Pattern2.ProxyPattern;

/**
 * Created by lx on 2018/9/28.
 */
public class ProxyTest {
    public static void main(String[] args)
    {  // TODO Auto-generated method stub
       People people_1 =new People();
       people_1.setCash(60000);
       people_1.setUsername("jeck");

       People people_2 =new People();
       people_2.setCash(40000);
       people_2.setUsername("rose");

       People people_3 =new People();
       people_3.setCash(0);
       people_3.setUsername("tom");
       people_3.setVip("vip");

       ProxyBuy_car proxy_buy = new ProxyBuy_car();
       proxy_buy.setPeople(people_1);
       proxy_buy.buy_car();
       proxy_buy.setPeople(people_2);
       proxy_buy.buy_car();
       proxy_buy.setPeople(people_3);
       proxy_buy.buy_car();
    }
}
