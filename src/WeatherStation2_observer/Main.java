package WeatherStation2_observer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(25.0f, 65.0f, 30.4f);
        weatherData.setMeasurements(30.0f, 70.0f, 29.2f);
        weatherData.setMeasurements(20.0f, 60.0f, 28.7f);
    }
}

// Интерфейс Subject (Субъект)
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Интерфейс Observer (Наблюдатель)
interface Observer {
    void update(float temperature, float humidity, float pressure);
}

// Интерфейс DisplayElement (Отображаемый элемент)
interface DisplayElement {
    void display();
}

// Класс WeatherData (погодные данные)
class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

// Класс CurrentConditionsDisplay (отображение текущих условий)
class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}

//public interface DisplayElement {
//    void display();
//}
