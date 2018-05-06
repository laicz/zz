package com.zhou.zz.base01;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:44:37
 */
public class SampleChineseSort {

	@SuppressWarnings("rawtypes")
	private final static Comparator CHINA_COMPARE = Collator.getInstance(java.util.Locale.CHINESE);

	public static void main(String[] args) {
		sortList();
		sortArray();
	}

	@SuppressWarnings("unchecked")
	private static void sortList() {
		List<String> list = Arrays.asList("fds", "fds", "fdsfsd");
		Collections.sort(list, CHINA_COMPARE);
		for (String str : list) {
			System.out.println(str);
		}
	}

	@SuppressWarnings("unchecked")
	private static void sortArray() {
		String[] array = { "fdsfsd", "fdsfsd", "fdsfds" };
		Arrays.sort(array, CHINA_COMPARE);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
