package com.pdang.springbootunittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.pdang.springbootunittest.controller", "com.pdang.springbootunittest.service"})
@EntityScan("com.pdang.springbootunittest.entity")
@EnableJpaRepositories("com.pdang.springbootunittest.repository")
public class SpringbootunittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootunittestApplication.class, args);
	}

}
