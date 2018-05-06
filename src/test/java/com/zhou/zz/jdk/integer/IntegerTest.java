package com.zhou.zz.jdk.integer;

public class IntegerTest {
	public static void main(String[] args) {
		Integer value = 123456;
		byte byteValue = value.byteValue();
		System.out.println(byteValue);
		System.out.println(value.hashCode());
		System.out.println(value.hashCode(2));
		Integer value2 = -1234567;
		System.out.println(Integer.compare(value2, value));
		System.out.println(Integer.compareUnsigned(value, value2));
	}
}
