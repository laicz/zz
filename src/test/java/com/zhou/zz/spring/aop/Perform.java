package com.zhou.zz.spring.aop;

import org.springframework.stereotype.Repository;

/**
 * 原始类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月18日下午10:12:46
 */
@Repository
public class Perform {

	public void show() {
		System.out.println("message from perform.show()");
	}
}
