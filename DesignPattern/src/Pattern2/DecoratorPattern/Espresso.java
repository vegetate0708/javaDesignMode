package Pattern2.DecoratorPattern;

/*
 * Ũ������ �̳���
 */
public class Espresso extends Beverage{
	public Espresso() {
		description="Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}



}
