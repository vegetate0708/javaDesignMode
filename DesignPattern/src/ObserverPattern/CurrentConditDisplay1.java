package ObserverPattern;
import java.util.Observable;
import java.util.Observer;
public class CurrentConditDisplay1 implements Observer{
	private float temperature;
    private float humidity;
    private float pre;
    private Observable weatherDate1;
        
	public CurrentConditDisplay1(Observable obs) {
	   this.weatherDate1=obs;
	   obs.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherDate1){
			WeatherDate1 weatherDate1=(WeatherDate1)o;
			this.temperature=weatherDate1.getTemperature();
			this.humidity=weatherDate1.getHumidity();
			this.pre=weatherDate1.getPressure();
			display();
		}
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("zhe shi java自带观察者"+temperature+":"+humidity+":"+pre);
	}
}
