package com.example.websocketdemo;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

@Slf4j
public class KafkaTest {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092, localhost:9094");
        props.put("key.serializer", StringSerializer.class);
        props.put("value.serializer", StringSerializer.class);

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        ProducerRecord<String, String> record = new ProducerRecord<>("test", "hello kafka");

        producer.send(record, (metadata, exception) -> {
            if (exception != null) {
                log.error("Failed to send record", exception);
                return;
            }
            log.info("Topid {}", metadata.topic());
            log.info("Partition {}", metadata.partition());
            log.info("Offset {}", metadata.offset());
            log.info("Timestamp {}", metadata.timestamp());
        });

        producer.flush();
    }
}
