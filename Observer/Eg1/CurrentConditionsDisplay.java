package Observer.Eg1;

import Observer.Eg1.Interface.IDisplayElement;
import Observer.Eg1.Interface.ISatelliteObserver;

public class CurrentConditionsDisplay implements ISatelliteObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.humidity = weatherData.getHumidity();
       this.pressure = weatherData.getPressure();
       display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + ", pressure="
                + pressure + "]";
    }
    
}
