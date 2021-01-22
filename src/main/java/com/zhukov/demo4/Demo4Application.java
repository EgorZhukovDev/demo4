package com.zhukov.demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
public class Demo4Application {

	@ResponseBody
	@RequestMapping("/ping")
	String empty(){
	return "pong";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}
}
