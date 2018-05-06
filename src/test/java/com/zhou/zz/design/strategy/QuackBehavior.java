package com.zhou.zz.design.strategy;

/**
 * 鸭子叫的行为也是变化的，需要抽取出来
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日上午10:01:36
 */
public interface QuackBehavior {
	void quack();
}
