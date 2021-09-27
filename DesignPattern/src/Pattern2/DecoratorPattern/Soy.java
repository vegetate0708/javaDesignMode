package Pattern2.DecoratorPattern;

/*
 * create by xuefu 2016/2/18
 * 豆浆调味品  装饰者
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return beverage.getSize();
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        double cost = beverage.cost() + 0.15;
        if (getSize() == Beverage.TALL) {
            cost += 0.10;
        } else if (getSize() == Beverage.GRANDE) {
            cost += 0.15;
        } else if (getSize() == Beverage.VENTI) {
            cost += 0.20;
        }
        return cost;
    }

}
