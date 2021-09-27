package Pattern3.ObserverPattern;

public class MainClass {
    public static void main(String[] args) {
        WeatherDate1 weatherDate1 = new WeatherDate1();
        CurrentConditDisplay1 conditDisplay1 = new CurrentConditDisplay1(weatherDate1);
        weatherDate1.setMeasurements(20, 20, 20);
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditDisplay currentConditDisplay = new CurrentConditDisplay(weatherDate);
        weatherDate.setMeasurements(222, 222, 222);
    }
}
