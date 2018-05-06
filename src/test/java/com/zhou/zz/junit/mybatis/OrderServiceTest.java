package com.zhou.zz.junit.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zhou.zz.mybaties.model.Order;
import com.zhou.zz.mybaties.model.Orderdetail;
import com.zhou.zz.mybatis.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class OrderServiceTest {

	@Autowired
	private OrderService orderService;

	@Test
	public void oneToMany() {
		Order order = orderService.findOrderAndDetailResultMap(1);
		System.out.println(JSON.toJSONString(order));
		List<Orderdetail> orderdetails = order.getOrderdetails();
		for (Orderdetail orderdetail : orderdetails) {
			System.out.println(JSON.toJSONString(orderdetail));
		}
	}
}
