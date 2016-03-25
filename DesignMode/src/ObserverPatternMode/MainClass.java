package ObserverPatternMode;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

public class MainClass {
public static void main(String[] args) {
	WeatherDate1 weatherDate=new WeatherDate1();
	CurrentConditDisplay1 conditDisplay=new CurrentConditDisplay1(weatherDate);
	weatherDate.setMeasurements(20, 20, 20);
	
}
}
