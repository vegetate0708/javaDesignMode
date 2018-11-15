package Pattern2.DecoratorPattern;
/*
 * create by xuefu 2016/1/18
 * ÄÌÅİ×°ÊÎÕß 
 */
public class Whip extends CondimentDecorator{
	private Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost=beverage.cost()+0.10;
		if(getSize()==Beverage.TALL){
			cost+=0.10;
		}else if(getSize()==Beverage.GRANDE){
			cost+=0.15;
		}else if(getSize()==Beverage.VENTI){
			cost+=0.20;
		}
		return cost;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}
