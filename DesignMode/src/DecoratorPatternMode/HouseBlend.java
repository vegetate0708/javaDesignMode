package DecoratorPatternMode;
/*
 * create by xuefu on 2016/2/18
 * ×ÛºÏÒûÁÏÀà
 */

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description="House Blend Coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
