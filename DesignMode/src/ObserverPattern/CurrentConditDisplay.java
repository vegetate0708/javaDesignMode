package ObserverPattern;

public class CurrentConditDisplay implements Observer ,DIsplayElement {
	
	private float temperature;
    private float humidity;
    private float pre;
    private WeatherDate weatherDate;
	public CurrentConditDisplay(Subject weatherdate) {
	      this.weatherDate=weatherDate;
	      weatherdate.registObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("zhe shi 手动实现观察者 "+temperature+":"+humidity+":"+pre);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.humidity=humidity;
		this.temperature=temp;
		this.pre=pressure;
		display();
	}

}
