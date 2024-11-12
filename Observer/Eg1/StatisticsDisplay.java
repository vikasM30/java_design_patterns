package Observer.Eg1;

import Observer.Eg1.Interface.IDisplayElement;
import Observer.Eg1.Interface.ISatelliteObserver;

public class StatisticsDisplay implements ISatelliteObserver, IDisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;
   
    public StatisticsDisplay(WeatherData weatherData) {
     this.weatherData = weatherData;
     weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
        + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update() {
        tempSum += weatherData.getTemperature();
        numReadings++;
      
        if (weatherData.getTemperature() > maxTemp) {
         maxTemp = weatherData.getTemperature();
        }
       
        if (weatherData.getTemperature() < minTemp) {
         minTemp = weatherData.getTemperature();
        }
      
        display();
    }
    
}
