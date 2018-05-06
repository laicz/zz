package com.zhou.zz.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ModelAttribute（value=""）放回具体类的方法
 * @author Mr.Zhou
 * @datatime 2018年4月16日上午9:20:19
 */
@Controller
@RequestMapping("/model")
public class ModelAttribute1Controller {

	@ModelAttribute("loginname")
	public String userModel1(@RequestParam("loginname") String loginname) {
		return loginname;
	}

	@RequestMapping("/login1")
	public String login1() {
		return "/model/result1";
	}

}
