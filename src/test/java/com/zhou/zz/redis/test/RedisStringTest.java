package com.zhou.zz.redis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * String数据类型测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月17日下午10:16:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:spring-redis.xml" })
public class RedisStringTest {

	@Autowired
	RedisString redisString;

	@Test
	public void testInt() {
		redisString.IntTest();
	}

	@Test
	public void incrInt() {
		redisString.incrInt();
	}

	@Test
	public void setString() {
		redisString.setString();
	}

	/**
	 * append 将值追加到某个值后面
	 * 
	 * @datatime 2018年4月17日下午10:42:31
	 * @return void
	 */
	@Test
	public void testAppend() {
		redisString.testAppend();
	}
}
