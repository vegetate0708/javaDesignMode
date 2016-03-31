package AdapterPatternMode;
/*
 * 绿头鸭是鸭子的子类
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying");
	}
    
}
