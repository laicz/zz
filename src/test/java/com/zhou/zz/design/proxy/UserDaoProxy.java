package com.zhou.zz.design.proxy;

/**
 * 简单代理模式
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月14日上午10:21:00
 */
public class UserDaoProxy implements IUserDao {

	// 被代理对象
	private IUserDao target;

	public UserDaoProxy(IUserDao object) {
		this.target = object;
	}

	@Override
	public void save() {
		System.out.println("开始事务........");
		target.save();
		System.out.println("提交事务........");
	}

}
