package com.zhou.zz.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午10:31:23
 */
public class ProxyFactory {

	// 维护一个目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成代理对象
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开始事务2.............");
						Object invoke = method.invoke(target, args);
						System.out.println("提交事务2.............");
						return invoke;
					}
				});
	}
}
