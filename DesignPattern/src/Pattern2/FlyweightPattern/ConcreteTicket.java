package Pattern2.FlyweightPattern;

/**
 * 〈具体享元类〉
 *
 * @author vegetate
 * @create 2018/11/9 14:55
 */

public class ConcreteTicket implements Ticket {
    String from;
    String to;
    public ConcreteTicket(String from,String to){
        this.from = from;
        this.to = to;
    }
    @Override
    public void showPrice(String type){
        if(type.equals("Gaotie")){
            System.out.println("从"+from+"到"+to+"的高铁票价为200元");
        }else{
            System.out.println("从"+from+"到"+to+"的动车票价为120元");
        }
    }
}