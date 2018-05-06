package com.zhou.zz.seckill.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhou.zz.sys.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	// 静态map集合，用来代替集合
	private static List<User> users = new ArrayList<User>();

	// @ModelAttribute
	// public void userModel(String username, String password, Model model) {
	// System.out.println("--------@ModleAttribute---------");
	// User user = new User();
	// user.setUsername(username);
	// user.setPassword(password);
	// // 将user对象添加到model中
	// model.addAttribute("user", user);
	// }

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String toRegister() {

		System.out.println(">>>>>>>>>>>>>>>register get()方法被执行<<<<<<<<<<<<<<");
		return "/sys/registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("loginname") String loginname, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		System.out.println("register post()方法被调用");
		User user = new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setUsername(username);
		System.out.println("注册用户：" + user);
		this.users.add(user);
		return "/sys/loginForm";
	}

	/**
	 * 登录方法
	 * 
	 * @datatime 2018年4月15日下午10:06:06
	 * @param loginname
	 * @param password
	 * @param model
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
			Model model) {
		for (User user : users) {
			if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
				model.addAttribute("user", user);
				// System.out.println();
				System.out.println("登录名：" + loginname + "，密码：" + password + "登录成功");
				return "/sys/welcome";
			}
		}
		System.out.println("登录名：" + loginname + "，密码：" + password + "登录失败");
		return "/sys/loginForm";
	}

	@RequestMapping("/login1")
	public String login(Model model) {
		// 从Model当中获取出在modelAttribute注释放入的user对象
		User user = (User) model.asMap().get("user");
		System.out.println(user);
		// 设置user的对象
		user.setUsername("测试");
		return "result1";
	}

	/**
	 * 使用@PathVariable时，一定要带上参数才能请求到 不然就无法被HandlerMapping映射到请求处理Handler，出现404
	 * 
	 * @datatime 2018年4月15日下午10:27:23
	 * @param shorturl
	 * @return void
	 */
	@RequestMapping("/check/{shorturl}")
	public void pathVariable(@PathVariable String shorturl) {
		System.out.println("获取到短地址 ： " + shorturl);
	}

	/**
	 * 测试requestHeader注解
	 * 
	 * @datatime 2018年4月15日下午10:31:56
	 * @param userAgent
	 * @param accepts
	 * @return void
	 */
	@RequestMapping(value = "/requestHeader")
	public void requestHeader(@RequestHeader("User-Agent") String userAgent,
			@RequestHeader(value = "Accept") String[] accepts, @RequestHeader(value = "Cookie") String cookie) {
		System.out.println("userAgent:" + userAgent);
		System.out.println("-------------------------------");
		for (String string : accepts) {
			System.out.println(string);
		}
		System.out.println("cookie:" + cookie);

	}

}
