package com.zhou.zz.currency.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:52:08
 */
public class AtomicIntegerArrayTest {

	static int[] value = new int[] { 1, 2 };

	static AtomicIntegerArray ai = new AtomicIntegerArray(value);

	/**
	 * 
	 * @datatime 2018年4月8日下午10:52:04
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		ai.getAndSet(0, 3);
		System.out.println(ai.get(0));
		System.out.println(value[0]);
	}

}
