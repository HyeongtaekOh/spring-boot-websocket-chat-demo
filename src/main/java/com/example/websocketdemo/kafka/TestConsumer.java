package com.example.websocketdemo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestConsumer {

    @KafkaListener(topics = "topic", groupId = "group_1")
    public void consume(Object message) {
        log.info("Consumed message: {}", message);
    }
}
