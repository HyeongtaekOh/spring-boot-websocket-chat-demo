package com.example.websocketdemo.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void create() {
        kafkaTemplate.send("topic", "hello kafka" + System.currentTimeMillis());
    }
    public void send(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
