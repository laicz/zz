package com.zhou.zz.design.strategy;

/**
 * 鸭子变化的行为的具体实现类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日上午10:11:05
 */
public class PutengFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("鸭子扑腾扑腾的飞........");
	}

}
