package com.yb.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ChatConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatConfigApplication.class, args);
	}
}
