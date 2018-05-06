package com.zhou.zz.currency.join;

public class ThreadDemo {

	public synchronized void method() {

	}

	public void method1() {
		synchronized (this) {

		}
	}

	public void method3() {
		synchronized (ThreadDemo.class) {

		}
	}

//	public static void main(String[] args) throws InterruptedException {
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("t1 thread start.....");
//			}
//		});
//		t1.join();
//	}
}
