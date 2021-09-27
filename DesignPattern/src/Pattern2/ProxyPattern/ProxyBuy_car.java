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
            System.out.print(people.getUsername() + "是vip 客户，可以直接购买新车！");
            return;
        }
        if (people.getCash() >= 50000) {
            System.out.println(people.getUsername() + "买了新车，交易结束！");
        } else {
            System.out.println(people.getUsername() + "钱不够，不能买车，继续比赛！");
        }
    }
}
