package com.zhou.zz.design.object.polymorphism;

/**
 * 我们通常会使用接口，继承或者包装类来实现多态，使软件更加的灵活，不幸的是，多态会引入更多的的调用 java不建议使用更多的内联代码
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月12日下午11:14:43
 */
public interface Array {

	public int get(int i);

	public void set(int i, int x);

	public int size();
}
