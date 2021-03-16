package com.gk.demo.cc.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.demo.cc.config.MqConfiguration;

@RestController
@RefreshScope
public class ConfigController {
	
	@Autowired
	private MqConfiguration mqConfiguration;
	
	@Value("${user.firstName}")
	private String firstName;
	
	@Value("${user.lastName}")
	private String lastName;
	
	@Value("${user.email}")
	private String email;
	
	@Value("${user.age}")
	private int age;
	
	@GetMapping("/mq")
	public MqConfiguration getMqConfig() {
		return mqConfiguration;
	}
	
	@GetMapping("/user")
	public String getUserConfig() {
		return firstName+"\n"+lastName+"\n"+email+"\n"+age;
	}

}
