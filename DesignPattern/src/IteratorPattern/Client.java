package IteratorPattern;

/**
 * ���ͻ����ࡵ
 *
 * @author vegetate
 * @create 2018/11/9 17:12
 */
public class Client {

    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //�����ۺ϶���
        Aggregate agg = new ConcreteAggregate(objArray);
        //ѭ������ۺ϶����е�ֵ
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
    public static void main(String[] args) {

        Client client = new Client();
        client.operation();
    }

}
