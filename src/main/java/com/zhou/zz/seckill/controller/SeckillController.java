package com.zhou.zz.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制层
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月15日上午11:56:03
 */
@Controller
public class SeckillController {

	@RequestMapping(value = "/aaa")
	public ModelAndView requestTest() {
		System.out.println("》》》》》》》》》》test《《《《《《《《《《《《");
		return null;
	}
}
