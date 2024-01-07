package com.example.websocketdemo;

import com.example.websocketdemo.kafka.TestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketDemoApplication {

	@Autowired
	private static TestProducer testProducer;

	public static void main(String[] args) {
		SpringApplication.run(WebsocketDemoApplication.class, args);
		testProducer.create();
	}
}
