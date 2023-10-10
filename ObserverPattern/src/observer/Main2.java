package observer;

import observer.impl.User;
import observer.impl.WeatherStation;

public class Main2 {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        User user1 = new User("Alice");
        User user2 = new User("bob");
        user1.setUpdate(data -> {
            weatherStation.removeObserver(user1);
            weatherStation.setWeatherData("alice->" + data);
            weatherStation.addObserver(user1);
        });
        weatherStation.addObserver(user1);
        weatherStation.addObserver(user2);

        weatherStation.setWeatherData("晴天");
    }
}
