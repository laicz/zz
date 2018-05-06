package com.zhou.zz.currency.util;

import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 
 */
public class BankWaterService implements Runnable {

	private CyclicBarrier c = new CyclicBarrier(4, this);

	private ExecutorService executor = Executors.newFixedThreadPool(4);

	private ConcurrentHashMap<String, Integer> sheetBankWaterCount = new ConcurrentHashMap<String, Integer>(4);

	private void count() {
		for (int i = 0; i < 4; i++) {
			executor.execute(new Runnable() {

				public void run() {
					sheetBankWaterCount.put(Thread.currentThread().getName(), 1);
					try {
						c.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}

				}
			});
		}
		executor.shutdown();
	}

	public void run() {
		int count = 0;
		for (Map.Entry<String, Integer> entry : sheetBankWaterCount.entrySet()) {
			count += entry.getValue();
		}
		System.out.println("����ǣ�" + count);
	}

	public static void main(String[] args) {
		BankWaterService service = new BankWaterService();
		service.count();
	}
}
