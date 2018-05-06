package com.zhou.zz.design.strategy;

/**
 * 鸭子的具体实现类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月13日上午10:07:52
 */
public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior = new PutengFly();
		quackBehavior = new GuaGuaQuack();
	}

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
	}
}
