package com.zhou.zz.design.object.polymorphism;

public class Main {
	public static void main(String[] args) {
		NativeArray array = new NativeArray(100000);
		for (int i = 0; i < array.size(); i++) {
			array.set(i, i);

		}
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			sum += array.get(i);
		}
		System.out.println(sum);
	}
}
