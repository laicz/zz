package com.zhou.zz.seckill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhou.zz.sys.model.User;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月15日下午8:20:29
 */
@Controller
@RequestMapping("/user")
public class User2Controller {

	private static final Logger logger = LoggerFactory.getLogger(User2Controller.class);

	/**
	 * modelAttribute会在requestmapping之前运行
	 * 
	 * @datatime 2018年4月15日下午8:24:58
	 * @param username
	 * @param password
	 * @param modelMap
	 * @return void
	 */
	@ModelAttribute
	public void userModel2(String username, String password, ModelMap modelMap) {
		System.out.println("#User2Controller@RequestMapping运行------");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		modelMap.addAttribute("user", user);

	}

	@RequestMapping("/login2")
	public String login2(ModelMap modelMap) {
		User user = (User)modelMap.get("user");
		System.out.println(user);
		
		return "result2";
	}

}
