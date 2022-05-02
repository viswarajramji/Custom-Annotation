package com.spring.aop.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.aop.examples.service.ApplicationService;

@Component
@RestController
public class Controller {

	@Autowired
	private ApplicationService applicationService;

	@GetMapping(value = "/ping")
	public String getSampleData() {
		return applicationService.getTestData();
	}

}
