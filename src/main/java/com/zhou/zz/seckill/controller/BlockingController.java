package com.zhou.zz.seckill.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试阻塞
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月27日下午11:25:45
 */
@Controller
@RequestMapping("/block")
@Scope("prototype")
public class BlockingController {

	@RequestMapping("/method1")
	public void method1() throws InterruptedException {

		System.out.println("start........");
		Thread.sleep(30000);
		System.out.println("end..........");
	}
}
