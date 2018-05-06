package com.zhou.zz.kafka.test;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

/**
 * 生产者
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月18日下午5:43:09
 */
public class KafkaProducerFactory {

	private static final String BOOTSTRAP_SERVERS = "192.168.58.164:9092";

	private static Producer<String, String> producer;

	public KafkaProducerFactory() {
		Properties props = new Properties();
		props.put("bootstrap.servers", BOOTSTRAP_SERVERS);// 服务器ip:端口号，集群用逗号分隔
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		producer = new KafkaProducer<String, String>(props);
	}

	public Producer<String, String> getProducer() {
		return new KafkaProducerFactory().producer;
	}

}
