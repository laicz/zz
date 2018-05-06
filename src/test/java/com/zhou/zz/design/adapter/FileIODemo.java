package com.zhou.zz.design.adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月12日下午3:26:37
 */
public class FileIODemo {

	public static void main(String[] args) throws FileNotFoundException {

		InputStream inputStream = new FileInputStream(new File(""));
		Reader reader = new InputStreamReader(inputStream);
		
		

	}

}
