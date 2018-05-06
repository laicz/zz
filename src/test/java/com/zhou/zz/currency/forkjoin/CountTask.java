package com.zhou.zz.currency.forkjoin;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午10:46:45
 */
public class CountTask extends RecursiveTask<Long> {

	private static final long serialVersionUID = 1L;

	private static final int THRESHOLD = 2;// ��ֵ
	private int start;
	private int end;

	public CountTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		long sum = 0L;

		boolean canCompute = (end - start) <= THRESHOLD;
		if (canCompute) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else {
			int middle = (start + end) / 2;
			CountTask leftTask = new CountTask(start, middle);
			CountTask rightTask = new CountTask(middle + 1, end);
			leftTask.fork();
			rightTask.fork();
			long leftResult = leftTask.join();
			long rightResult = rightTask.join();

			sum = leftResult + rightResult;
		}
		return sum;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		CountTask task = new CountTask(1, 1000000000);
		long start = new Date().getTime();
		ForkJoinTask<Long> submit = forkJoinPool.submit(task);
		start = new Date().getTime();
		long count = 0L;
		for (int i = 1; i <= 1000000000; i++) {
			count += i;
		}
	}

}
