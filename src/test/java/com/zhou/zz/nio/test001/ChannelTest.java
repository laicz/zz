package com.zhou.zz.nio.test001;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * channel 特性测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月10日下午9:05:28
 */
public class ChannelTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("‪D:\nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		 
		ByteBuffer buf = ByteBuffer.allocate(48);
		 
		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {
		 
		System.out.println("Read " + bytesRead);
		buf.flip();
		 
		while(buf.hasRemaining()){
		System.out.print((char) buf.get());
		}
		 
		buf.clear();
		bytesRead = inChannel.read(buf);
		}
		aFile.close();

	}
}
