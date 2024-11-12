package Observer.Eg1;

import java.util.ArrayList;
import java.util.List;

import Observer.Eg1.Interface.ISatelliteObserver;
import Observer.Eg1.Interface.IWeatherServer;

public class WeatherData implements IWeatherServer{
    private List<ISatelliteObserver> iSatelliteObserver;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        iSatelliteObserver = new ArrayList<ISatelliteObserver>();
    }

    @Override
    public void registerObserver(ISatelliteObserver o) {
        iSatelliteObserver.add(o);
    }

    @Override
    public void removeObserver(ISatelliteObserver o) {
        int i = iSatelliteObserver.indexOf(o);
        if (i >= 0) {
         iSatelliteObserver.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (ISatelliteObserver iSatelliteObserver : iSatelliteObserver) {
            iSatelliteObserver.update();
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
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
