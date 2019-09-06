package com.ant.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.ant.app.*"})
@MapperScan("com.ant.app.dao")
@SpringBootApplication
public class AntAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntAppApplication.class, args);
	}

}
