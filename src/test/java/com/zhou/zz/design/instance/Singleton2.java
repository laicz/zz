package com.zhou.zz.design.instance;

/**
 * 懒汉式
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午9:57:56
 */
public class Singleton2 {

	private static Singleton2 INSTANCE;

	private Singleton2() {
	}

	public Singleton2 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton2();
		}
		return INSTANCE;
	}

}
