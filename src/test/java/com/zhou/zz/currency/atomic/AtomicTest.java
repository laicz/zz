package com.zhou.zz.currency.atomic;

import java.util.ArrayList;
import java.util.List;

public class AtomicTest {

	private volatile static int count;
	// private volatile static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {

		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 100; i++) {
			threads.add(new Thread(new Runnable() {

				public void run() {
					for (int j = 0; j < 100000; j++) {
						// count.incrementAndGet();
						count++;
					}
				}
			}));
		}
		for (Thread thread : threads) {
			thread.start();
		}
		Thread.sleep(5000);
		System.out.println(count);
	}
}
