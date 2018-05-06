package com.zhou.zz.currency.threadpool;

import java.util.Calendar;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.alibaba.fastjson.JSONObject;

public class Test {
	public static void main(String[] args) {
		LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<String>();
		ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(2);
		ExecutorService service = Executors.newFixedThreadPool(1);

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		System.out.println(cal.getTime().getTime());
	}
}
