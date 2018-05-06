package com.zhou.zz.currency.atomic;

import java.util.concurrent.atomic.AtomicReference;


public class AtomicReferenceTest {

	public static AtomicReference<User> atomicUser = new AtomicReference<User>();

	public static void main(String[] args) {
		User user = new User("conan", 15);
		atomicUser.set(user);
		User updateUser = new User("Shinici", 1);
		atomicUser.compareAndSet(user, updateUser);
		System.out.println(atomicUser.get().getName());
		System.out.println(atomicUser.get().getOld());
	}

	static class User {

		private String name;
		private int old;

		public User(String name, int old) {
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
