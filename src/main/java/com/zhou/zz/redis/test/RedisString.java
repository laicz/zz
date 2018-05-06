package com.zhou.zz.redis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisString {

	@Autowired
	private JedisPool jedisPool;

	private Jedis jedis;

	public void IntTest() {
		jedis = jedisPool.getResource();
		jedis.select(8);

		jedis.set("string_key_1", "1");
		jedis.set("string_key_2", "2");
		jedis.set("string_key_3", "3");
		jedis.set("string_key_4", "4");
		jedis.close();
	}

	public void incrInt() {
		jedis = jedisPool.getResource();
		jedis.select(8);

		jedis.incrBy("string_key_1", Integer.valueOf(jedis.get("string_key_1")));
		jedis.incrBy("string_key_2", Integer.valueOf(jedis.get("string_key_2")));
		jedis.incrBy("string_key_3", Integer.valueOf(jedis.get("string_key_3")));
		jedis.incrBy("string_key_4", Integer.valueOf(jedis.get("string_key_4")));
		jedis.close();
	}

	public void setString() {
		jedis = jedisPool.getResource();
		jedis.select(8);

		jedis.set("string_key_s1", "aaa");
		jedis.set("string_key_s2", "2cccc");
		jedis.set("string_key_s3", "3fdsfdfsd");
		jedis.set("string_key_s4", "4fdsfafdsafasd");
		jedis.close();
	}

	public void testAppend() {
		jedis = jedisPool.getResource();
		jedis.select(8);

		jedis.append("string_key_s1", "——最后追加上去的值");
		jedis.close();
	}

}
