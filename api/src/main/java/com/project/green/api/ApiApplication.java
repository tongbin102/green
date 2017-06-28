package com.project.green.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Controller
//@EnableWebMvc
@SpringBootApplication
//@MapperScan(basePackages = "com.project.green.api.repository.mapper")
public class ApiApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
