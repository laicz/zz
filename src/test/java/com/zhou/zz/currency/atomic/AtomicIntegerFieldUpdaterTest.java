package com.zhou.zz.currency.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:54:38
 */
public class AtomicIntegerFieldUpdaterTest {

	private static AtomicIntegerFieldUpdater<User> atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater
			.newUpdater(User.class, "old");

	public static void main(String[] args) {

	}

	static class User {

		private String name;
		private volatile int old;

		public User(String name, int old) {
			super();
			this.name = name;
			this.old = old;
		}

		public String getName() {
			return name;
		}

		public int getOld() {
			return old;
		}

	}
}
