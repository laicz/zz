package com.zhou.zz.currency.util;
/*8
 * 
 */
public class JoinCountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		Thread parsert1 = new Thread(new Runnable() {
			public void run() {

			}
		});
		Thread parsert2 = new Thread(new Runnable() {
			public void run() {

			}
		});

		parsert1.start();
		parsert2.start();
		parsert1.join();
		parsert2.join();
		System.out.println("all parsert finish");
	}
}
