package com.zhou.zz.currency.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:53:28
 */
public class SemaphoreTest {

	private static final int THREAD_COUNT = 30;

	private static ExecutorService threadPool = Executors.newFixedThreadPool(30);

	private static Semaphore semaphore = new Semaphore(10);

	public static void main(String[] args) {
		for (int i = 0; i < THREAD_COUNT; i++) {
			threadPool.execute(new Runnable() {

				public void run() {
					try {
						semaphore.acquire();
						System.out.println("save data");
						semaphore.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			});
		}
		threadPool.shutdown();
	}

}
