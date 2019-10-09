package com.ant.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.ant.web.*"})
@MapperScan("com.ant.web.dao")
@SpringBootApplication
public class AntWebNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntWebNewApplication.class, args);
	}

}
