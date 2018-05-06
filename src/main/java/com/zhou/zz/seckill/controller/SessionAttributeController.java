package com.zhou.zz.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zhou.zz.sys.model.User;

/**
 * SessionAttribute测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月15日下午10:46:22
 */
@Controller
@SessionAttributes(names = { "user", "xiao" }) // sessionattribute中含有的才是放入session中的
@RequestMapping("/session")
public class SessionAttributeController {

	@RequestMapping(value = "/{forname}")
	public String loginForm(@PathVariable String forname) {
		return "/session/" + forname;
	}

	@RequestMapping("/login")
	public String login(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			Model model) {

		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setUsername("admin");
		model.addAttribute("user", user);
		User user2 = new User();
		user2.setUsername("xiao");
		model.addAttribute("xiao", user2);
		return "/session/welcome";
	}
}
