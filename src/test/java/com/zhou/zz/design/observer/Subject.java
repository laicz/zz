package com.zhou.zz.design.observer;

/**
 * 观察者模式之主体接口
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日下午2:46:44
 */
public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObserver();

}
