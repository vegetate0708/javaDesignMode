package Pattern3.ObserverPattern;

import java.util.Observable;

public class WeatherDate1 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate1() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
