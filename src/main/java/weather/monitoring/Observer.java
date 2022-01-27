package weather.monitoring;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
