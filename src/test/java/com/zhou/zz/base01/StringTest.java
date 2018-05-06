package com.zhou.zz.base01;

import org.junit.Test;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:53:12
 */
public class StringTest {

	private String getA() {
		return "a";
	}

	@Test
	public void test1() {
		String a = "a";
		final String c = "a";
		String b = a + "b";
		String d = c + "b";
		String e = getA() + "b";

		String compare = "ab";
		System.out.println(b == compare);// ʹ�ñ���ʱ�����������
		System.out.println(d == compare);
		System.out.println(e == compare);
	}

	@Test
	public void test3() {
		String a = "a";
		String b = a + "b";
		String c = "ab";
		String d = new String(b);
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println(c == d.intern());
		System.out.println(b.intern() == d.intern());
	}
}
