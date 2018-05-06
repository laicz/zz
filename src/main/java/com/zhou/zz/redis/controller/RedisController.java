package com.zhou.zz.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.zz.common.jedis.RedisClientTemplate;

/**
 * 用于测试给Redis工具类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月22日下午11:04:51
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

	@Autowired
	private RedisClientTemplate redisClientTemplate;

	@RequestMapping("/setStr")
	public void setStr() {
		String set = redisClientTemplate.set("setStr", "setStr_value");
		// return set;
		System.out.println(set);
	}
}
