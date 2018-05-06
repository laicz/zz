package com.zhou.zz.design.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject subject;// 观察者含有目标对象 含有目标对象的目的是为了以后撤销方便

	public CurrentConditionDisplay(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("temperature:" + temperature + " , humidity：" + humidity);
	}

}
