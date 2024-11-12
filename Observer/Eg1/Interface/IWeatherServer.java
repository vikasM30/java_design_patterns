package Observer.Eg1.Interface;

public interface IWeatherServer {
    public void registerObserver(ISatelliteObserver o);
    public void removeObserver(ISatelliteObserver o);
    public void notifyObserver();
}
