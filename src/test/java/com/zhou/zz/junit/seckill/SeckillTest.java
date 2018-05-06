package com.zhou.zz.junit.seckill;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhou.zz.seckill.service.TSeckillService;

/**
 * 秒杀单元测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午9:26:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class SeckillTest {
	@Autowired
	private TSeckillService service;

	private AtomicInteger count = new AtomicInteger(0);
	private AtomicInteger account = new AtomicInteger(0);
	private String sku = "iphone7";
	private int buys = 3;

	@Test
	public void ms() throws InterruptedException {

		for (int i = 0; i < 300; i++) {

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					if (service.updateNum(sku, buys)) {
						account.incrementAndGet();
						count.addAndGet(buys);
					}
				}
			});
			thread.start();
			thread.join();
		}
		System.out.println("=========成功购买商品的数量============" + count);
		System.out.println("=========成功购买商品的次数============" + account);
	}
}
