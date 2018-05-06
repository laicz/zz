package com.zhou.zz.design.proxy;

/**
 * 动态代理测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午10:37:33
 */
public class DynamicProxyTest {
	public static void main(String[] args) {
		IUserDao target = new UserDao();
		System.out.println(target.getClass());

		// 给目标对象创建代理对象
		IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());

		proxy.save();
	}
}
