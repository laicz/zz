package com.zhou.zz.seckill.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhou.zz.seckill.model.Book;

/**
 * 测试json转换
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月16日上午10:04:44
 */
@Controller
@RequestMapping("/json")
public class BookController {

	/**
	 * @RequestBody将请求参数为json格式的数据转换成对象（如果没有传入参数则无法请求到该方法） @datatime
	 *                                                     2018年4月16日上午10:08:20
	 * @param book
	 * @param response
	 * @return void
	 * @throws IOException
	 */
	@RequestMapping("/testRequestBody")
	public void seetJson(/* @RequestBody */ Book book, HttpServletResponse response) throws IOException {
		System.out.println("获取的：" + book);
		book.setAuthor("zhou");
		book.setName("找工作的");
		response.getWriter().println(JSON.toJSONString(book));
	}

	@RequestMapping("/getJSon")
	@ResponseBody
	public Object getJson() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(22, "zhou的书", "zhou"));
		books.add(new Book(33, "zhuang的书", "zhuang"));
		return books;
	}
}
