package com.zhou.zz.junit.seckill;

/**
 * 一致hashcode测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月22日下午8:10:02
 */
public class HashCodeConsidency {
	public static void main(String[] args) {
		Integer value_0 = 0;
		System.out.println(value_0.hashCode());
		Integer value_1 = 1;
		System.out.println(value_1.hashCode());
		Integer value_2 = 2;
		System.out.println(value_2.hashCode());
		Integer value_3 = 3;
		System.out.println(value_3.hashCode());
	}
}
