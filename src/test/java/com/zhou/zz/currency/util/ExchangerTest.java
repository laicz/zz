package com.zhou.zz.currency.util;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:46:08
 */
public class ExchangerTest {

	private static final Exchanger<String> exchanger = new Exchanger<String>();

	private static ExecutorService executorService = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {
		executorService.execute(new Runnable() {

			public void run() {
				String a = "fdsfsd";
				try {
					String exchange = exchanger.exchange(a);
					System.out.println("fdsafds" + exchange);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		executorService.execute(new Runnable() {

			public void run() {
				String b = "fdsfds";
				try {
					String exchange = exchanger.exchange(b);
					System.out.println("fdsafsd" + exchange);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		executorService.shutdown();
	}
}
