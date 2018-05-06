package com.zhou.zz.currency.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:54:02
 */
public class AtomicBooleanTest {

	static AtomicBoolean atomicBoolean = new AtomicBoolean(true);

	public static void main(String[] args) {
		System.out.println(atomicBoolean.get());
		System.out.println(atomicBoolean.compareAndSet(Boolean.TRUE, Boolean.FALSE));
		System.out.println(atomicBoolean.get());
		System.out.println(atomicBoolean.compareAndSet(Boolean.TRUE, Boolean.FALSE));
		System.out.println(atomicBoolean.compareAndSet(Boolean.FALSE, Boolean.TRUE));
	}

}
