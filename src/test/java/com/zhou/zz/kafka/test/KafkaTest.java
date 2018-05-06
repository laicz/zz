package com.zhou.zz.kafka.test;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;

public class KafkaTest {

	@Test
	public void send() {
		Producer<String, String> producer = new KafkaProducerFactory().getProducer();

		for (int i = 0; i < 100; i++) {
			producer.send(new ProducerRecord<String, String>("test1", Integer.toString(i)));
		}
	}

	@Test
	public void receive() {
		Consumer<String, String> consumer = new KafkaConsumerFactory().getKafkaConsumer();
		while (true) {
			ConsumerRecords<String, String> poll = consumer.poll(100);
			for (ConsumerRecord<String, String> record : poll) {
				System.out.printf("offset = %d, key = %s, value = %s\n", record.offset(), record.key(), record.value());
			}
		}
	}
}
