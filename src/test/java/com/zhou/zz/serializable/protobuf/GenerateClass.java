package com.zhou.zz.serializable.protobuf;

import java.io.IOException;

/**
 * 生成protobuf类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月26日下午10:00:43
 */
public class GenerateClass {
	public static void main(String[] args) {
		String protoFile = "person-entity.proto";
		String strCmd = "F:\\environment\\protobuf\\protoc-3.5.1-win32\\bin\\protoc.exe -I=./proto --java_out=./src/main/java ./proto/"+ protoFile;
		 try {
	            Runtime.getRuntime().exec(strCmd);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }//通过执行cmd命令调用protoc.exe程序  
	}
}
