package com.example.mysqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.mysqdemo.repository")
@SpringBootApplication
public class MysqdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqdemoApplication.class, args);
	}
}
