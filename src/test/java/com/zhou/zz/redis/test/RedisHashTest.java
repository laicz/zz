package com.zhou.zz.redis.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:spring-redis.xml" })
public class RedisHashTest {

	@Autowired
	RedisHash redisHash;
	String key = "hmkey::zhuang";

	@Test
	public void hmset() {
		Map<String, String> map = new HashMap<String, String>();
		String hmset;
		try {
//			map.put("key1", "value1");
//			map.put("key2", "value2");
			map.put("key3", "newvalue3");
			map.put("key4", "newvalue4");
			hmset = redisHash.hmset(key, map,3);
			System.out.println(hmset);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
