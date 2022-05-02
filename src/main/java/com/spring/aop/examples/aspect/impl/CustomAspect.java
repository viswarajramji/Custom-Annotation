package com.spring.aop.examples.aspect.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class CustomAspect {
	@Around("@annotation(com.spring.aop.examples.aspect.LoggingAnnonation)")
	public Object performLogging(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("***** custom aspect invoked ********");
		log.info("start-milli-seconds " + System.currentTimeMillis());
		Object result = joinPoint.proceed();
		log.info("end-milli-seconds " + System.currentTimeMillis());
		return result;
	}
}
