package com.zhou.zz.redis.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisHash {

	@Autowired
	private JedisPool jedisPool;

	private Jedis jedis;

	public String hmset(String key, Map<String, String> map, Integer flag) throws Exception {
		jedis = jedisPool.getResource();
		jedis.select(8);

		if (flag == 1) {
			String hmset = jedis.hmset(key, map);
			return hmset;
		} else if (flag == 2) {
			String hmset = jedis.hmset(key, map);
			return hmset;
		} else if (flag == 3) {
			List<String> hmget = jedis.hmget(key, new String[] { "key1", "key3" });
			Map<String, String> hgetAll = jedis.hgetAll(key);
			Set<String> hkeys = jedis.keys("*key*");
			return JSON.toJSONString(hgetAll);
		} else {
			return "";
		}

	}

}
