package com.zhou.zz.design.observer;

/**
 * 天气观察者接口
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日下午2:56:49
 */
public interface Observer {
	
	public void update(float temp,float humidity,float pressure);
}
