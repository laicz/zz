package com.zhou.zz.serializable.protobuf;

import org.aspectj.weaver.patterns.PerSingleton;

import com.google.protobuf.InvalidProtocolBufferException;
import com.zhou.zz.serializable.protobuf.PersonEntity.Person;

/**
 * personentity 的protobuf序列化协议测试
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月26日下午10:58:45
 */
public class PersonEntityTest {
	public static void main(String[] args) throws InvalidProtocolBufferException {
		// 模拟将对象转换成byte[] ，方便传输
		PersonEntity.Person.Builder builder = PersonEntity.Person.newBuilder();
		builder.setId(1);
		builder.setName("ant");
		builder.setEmail("zhouzhuang@163.com");
		PersonEntity.Person person = builder.build();
		System.out.println("before:" + person.toString());

		System.out.println("============Person byte===========");
		for (byte b : person.toByteArray()) {
			System.out.print(b);
		}

		System.out.println();
		System.out.println(person.toByteString());
		System.out.println("==================================");

		// 模拟接收byte[]，反序列化成person类
		byte[] byteArray = person.toByteArray();
		Person person2 = Person.parseFrom(byteArray);
		System.out.println("after:" + person2.toString());

		String has = "12212";
		System.out.println(has.hashCode());
	}
}
