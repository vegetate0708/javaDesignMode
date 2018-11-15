package Pattern2.FlyweightPattern;

/**
 * ��������Ԫ�ࡵ
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
            System.out.println("��"+from+"��"+to+"�ĸ���Ʊ��Ϊ200Ԫ");
        }else{
            System.out.println("��"+from+"��"+to+"�Ķ���Ʊ��Ϊ120Ԫ");
        }
    }
}