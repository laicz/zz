package com.zhou.zz.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月18日下午10:14:02
 */
@Aspect
@Component
public class Audience {

	@Pointcut("execution(* com.zhou.zz.spring.aop.Perform.show(..))")
	public void performance() {

	}

	@Before("performance()")
	public void beforeShow() {
		System.out.println("beforeshow");
	}

	@After("performance()")
	public void afterShow() {
		System.out.println("afterShow");
	}
	
	@Around("performance()")  
    public void around(ProceedingJoinPoint joinpoint) {  
        System.out.println("message from Start around");  
        long start = System.currentTimeMillis();  
        try {  
            joinpoint.proceed();  
        } catch (Throwable e) {  
            e.printStackTrace();  
        }  
        long end = System.currentTimeMillis();  
        System.out.println("message from End around total : " + (end - start)  
                + " ms");  
    }  
}
