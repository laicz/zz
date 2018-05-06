package com.zhou.zz.kafka.test;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;

/**
 * 消费者
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月18日下午5:43:22
 */
public class KafkaConsumerFactory {

	private static final String BOOTSTRAP_SERVERS = "192.168.58.164:9092";

	private static Consumer<String, String> consumer;

	public KafkaConsumerFactory() {
		Properties props = new Properties();
		props.put("bootstrap.servers", BOOTSTRAP_SERVERS);// 服务器ip:端口号，集群用逗号分隔
		props.put("group.id", "test");
		props.put("enable.auto.commit", "true");
		props.put("auto.commit.interval.ms", "1000");
		props.put("session.timeout.ms", "30000");
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		consumer = new KafkaConsumer<String, String>(props);
		consumer.subscribe(Arrays.asList("test1"));
	}

	public Consumer<String, String> getKafkaConsumer() {
		return new KafkaConsumerFactory().consumer;
	}
}
