package ObserverPattern;

public class MainClass {
public static void main(String[] args) {
	WeatherDate1 weatherDate=new WeatherDate1();
	CurrentConditDisplay1 conditDisplay=new CurrentConditDisplay1(weatherDate);
	weatherDate.setMeasurements(20, 20, 20);
	
}
}
