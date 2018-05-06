package com.zhou.zz.design.observer;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 被观察者观察的主体对象
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日下午3:56:17
 */
public class WeatherData implements Subject {

	/**
	 * 观察者队列
	 */
	private ArrayList<Observer> observers;

	private float temperature;

	private float humidity;

	private float pressure;

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	/**
	 * 气象站观测到的更新的值
	 * 
	 * @datatime 2018年4月13日下午4:04:03
	 * @return void
	 */
	public void measurementChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temprature, float humidity, float pressure) {
		this.temperature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	// WeatherData的其他方法
}
