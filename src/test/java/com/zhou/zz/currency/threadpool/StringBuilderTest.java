package com.zhou.zz.currency.threadpool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringBuilderTest {

	private static StringBuilder stringBuilder = new StringBuilder();

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(5);
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20000; i++) {
					stringBuilder.append("a");
				}
				latch.countDown();
			}
		});
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20000; i++) {
					stringBuilder.append("b");
				}
				latch.countDown();
			}
		});
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20000; i++) {
					stringBuilder.append("c");
				}
				latch.countDown();
			}
		});
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20000; i++) {
					stringBuilder.append("d");
				}
				latch.countDown();
			}
		});
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20000; i++) {
					stringBuilder.append("e");
				}
				latch.countDown();
			}
		});
		latch.await();
		executorService.shutdown();
		System.out.println("================");
		System.out.println(stringBuilder.length());
	}
}
