package com.example.websocketdemo.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestProducerTest {

    @Autowired
    private TestProducer testProducer;

    @Test
    void create() {
        testProducer.create();
    }
}