package com.spring.aop.examples.service;

import org.springframework.stereotype.Component;

import com.spring.aop.examples.aspect.LoggingAnnonation;

@Component
public class ApplicationService {

	@LoggingAnnonation
	public String getTestData() {
		return "hello world";
	}
}
