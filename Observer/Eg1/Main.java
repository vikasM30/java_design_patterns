package Observer.Eg1;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,30,56);
        weatherData.setMeasurements(30,330,563);
    }
}
