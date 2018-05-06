package com.zhou.zz.jdk.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class LambdaTest {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("before 8");
			}
		}).start();

		new Thread(() -> System.out.print("in the java8")).start();

		List<String> lists = Arrays.asList("a", "b", "c", "d", "e");
		lists.forEach(n -> System.out.println(n));
		lists.forEach(System.out::println);

		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		System.out.println("Languages whic start with J :");
		filter(languages, str -> str.startsWith(str));
		System.out.println(languages);

		Integer value = 1111;
		check(value);
		System.out.println(value);
		Map<String, String> strMap = new HashMap<String, String>();
		strMap.put("a", "b");
		check(strMap);
		System.out.println(strMap.values());

	}

	private static void check(Map<String, String> strMap) {
		strMap.put("a", "new Str");
	}

	private static void check(Integer str) {
		str = 2222;
	}

	public static void filter(List<String> language, Predicate<String> condition) {
		// for (String string : language) {
		// if (condition.test(string)) {
		// System.out.println(string + "-");
		// }
		// }
		language.forEach(n -> condition.test(n));
	}
}
