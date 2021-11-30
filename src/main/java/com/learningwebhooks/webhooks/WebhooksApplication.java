package com.learningwebhooks.webhooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebhooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhooksApplication.class, args);
	}

	//TODO to run the application's git webhook on localhost use `ssh -R 80:localhost:8080 localhost.run`
}
