package com.zhou.zz.design.proxy;

/**
 * 简单代理模式测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午10:25:28
 */
public class SimpleProxyTest {
	public static void main(String[] args) {
		IUserDao target = new UserDao();
		UserDaoProxy proxy = new UserDaoProxy(target);
		proxy.save();
	}
}
