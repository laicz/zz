package com.zhou.zz.design.strategy;

import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;

/**
 * 鸭子基类，会将变化的行为抽取出来
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日上午9:53:27
 */
public class Duck {

	protected FlyBehavior flyBehavior;

	protected QuackBehavior quackBehavior;

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("鸭子游泳");
	}

	public void display() {
		System.out.println("鸭子的外貌");
	}

	public void performQuack() {
		quackBehavior.quack();
	}

}
