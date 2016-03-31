package AdapterPatternMode;

public class TurkeyAdapter implements Duck{
    Turkey turkey;
	public TurkeyAdapter(Turkey turkey) {
		this.turkey=turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			turkey.fly();
		}
	}

}
