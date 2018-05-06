package com.zhou.zz.design.strategy;

/**
 * 鸭子叫的动态动作的具体实现类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日上午10:13:07
 */
public class GuaGuaQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("鸭子呱呱叫.............");
	}

}
