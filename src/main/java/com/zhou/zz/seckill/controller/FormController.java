package com.zhou.zz.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ModelAttribute的用法
 * @author Mr.Zhou
 * @datatime 2018年4月16日上午9:15:50
 */
@Controller
@RequestMapping("/model")
public class FormController {

	@RequestMapping("/{formname}")
	public String loginForm(@PathVariable String formname) {
		return "/model/" + formname;
	}
}
