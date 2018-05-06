package com.zhou.zz.junit.index;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhou.zz.index.model.IndexUrl;
import com.zhou.zz.index.service.IndexUrlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class IndexUrlTest {

	@Autowired
	private IndexUrlService indexUrlService;

	private static final String[] values = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "z", "x", "c", "v", "b", "n",
			"m", "a", "s", "d", "f", "h", "g", "j", "k", "l", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p" };

	private static final int length = values.length;

	@Test
	public void insert() {
		IndexUrl index = null;
		Random random = new Random();
		for (int i = 0; i < 10000000; i++) {
			index = new IndexUrl();
			index.setId(i);
			StringBuffer url = new StringBuffer();
			for (int j = 0; j < 12; j++) {
				url.append(values[random.nextInt(length)]);
			}
			index.setUrl(url.toString());
			indexUrlService.insert(index);
		}
	}

}
