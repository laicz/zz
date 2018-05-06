package com.zhou.zz.base01;

import java.util.HashMap;
import java.util.Map;

public class YuTest {
	public static void main(String[] args) {
		// 只有取二次幂的值得值才能用这种方法取模
		//只有是2的情况下   n-1 = 0111111...
		int num = 64;
		System.out.println(num);
		System.out.println(num % 16);
		System.out.println(15 & num);
		
		Map<String,String> map = new HashMap<String,String>();
	}
}
