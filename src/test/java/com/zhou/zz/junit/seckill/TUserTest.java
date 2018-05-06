package com.zhou.zz.junit.seckill;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhou.zz.mybaties.model.TUser;
import com.zhou.zz.mybatis.service.TUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:mybatis-config.xml" })
public class TUserTest {

	@Autowired
	TUserService service;

	@Test
	public void test() {
		TUser user = service.getUserWithRole(2);
		System.out.println(user);
		System.out.println("---------------------------");
		TUser tUser = service.selectByPrimaryKey(2);
		System.out.println(tUser);
	}

}
