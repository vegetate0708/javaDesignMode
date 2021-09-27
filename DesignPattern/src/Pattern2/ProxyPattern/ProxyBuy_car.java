package Pattern2.ProxyPattern;

/**
 * Created by lx on 2018/9/28.
 */
public class ProxyBuy_car implements Buy_car {
    private People people;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public void buy_car() {
        if (people.getVip() == "vip") {
            System.out.print(people.getUsername() + "��vip �ͻ�������ֱ�ӹ����³���");
            return;
        }
        if (people.getCash() >= 50000) {
            System.out.println(people.getUsername() + "�����³������׽�����");
        } else {
            System.out.println(people.getUsername() + "Ǯ�����������򳵣�����������");
        }
    }
}
