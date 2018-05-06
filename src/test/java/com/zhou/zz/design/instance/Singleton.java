package com.zhou.zz.design.instance;

/**
 * 静态内部类（优点：能够延迟加载）
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午9:51:45
 */
public class Singleton {

	private Singleton() {

	}

	private static class InterInstance {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return InterInstance.INSTANCE;
	}
}
