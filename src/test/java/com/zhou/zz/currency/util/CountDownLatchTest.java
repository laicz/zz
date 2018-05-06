package com.zhou.zz.currency.util;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:52:36
 */
public class CountDownLatchTest {

	static CountDownLatch c = new CountDownLatch(2);

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			public void run() {
				System.out.println(1);
				c.countDown();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(2);
				c.countDown();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				try {
					c.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		c.await();
		System.out.println("3");
	}
}
