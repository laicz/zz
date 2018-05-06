package com.zhou.zz.junit.seckill;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.zhou.zz.seckill.model.Meituan;
import com.zhou.zz.seckill.service.MeituanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class MeituanServiceTest {

	@Autowired
	private MeituanService service;

	@Test
	public void test1() {
		PageHelper.startPage(2,3);
		List<Meituan> selectAll = service.selectAll();
		for (Meituan meituan : selectAll) {
			System.out.println(meituan);
		}
	}

}
