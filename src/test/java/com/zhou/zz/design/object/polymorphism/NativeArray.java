package com.zhou.zz.design.object.polymorphism;

public class NativeArray implements Array {

	protected int[] array;

	public NativeArray(int cap) {
		array = new int[cap];
	}

	@Override
	public int get(int i) {

		return array[i];
	}

	@Override
	public void set(int i, int x) {
		array[i] = x;
	}

	@Override
	public int size() {
		return array.length;
	}
	
}
