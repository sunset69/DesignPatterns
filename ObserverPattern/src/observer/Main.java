package observer;

import observer.impl.User;
import observer.impl.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        //1. 未添加观察
        System.out.println("==========================");
        weatherStation.setWeatherData("晴天");

        // 2. 添加观察
        System.out.println("==========================");
        weatherStation.addObserver(user1);
        weatherStation.addObserver(user2);

        weatherStation.setWeatherData("晴天");
        weatherStation.setWeatherData("下雨");

        // 3. user1 解除观察
        System.out.println("==========================");
        weatherStation.removeObserver(user1);

        weatherStation.setWeatherData("下雪");
    }
}
