package com.zhou.zz.design.instance;

/**
 * 饿汉式单例模式
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午9:55:32
 */
public class Singleton1 {
	private static final Singleton1 INSTANCE = new Singleton1();

	private Singleton1() {

	}

	public static Singleton1 getInstance() {
		return INSTANCE;
	}
}
