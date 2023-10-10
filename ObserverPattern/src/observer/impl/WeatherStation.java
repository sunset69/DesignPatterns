package observer.impl;

import observer.observer.Observer;
import observer.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察对象
 */
public class WeatherStation implements Subject {

    /**
     * 观察者
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 观察内容
     */
    private String weatherData;

    /**
     * 添加观察者
     *
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        // 通知所有观察者，实现一对多
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    /**
     * 变更观察数据，变更时通知观察者
     *
     * @param data 变更数据
     */
    public void setWeatherData(String data) {
        this.weatherData = data;
        notifyObservers();//变更时通知
    }
}
