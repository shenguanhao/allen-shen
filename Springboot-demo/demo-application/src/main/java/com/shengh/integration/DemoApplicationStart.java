package com.shengh.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@ComponentScan("com.demo")
public class DemoApplicationStart {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationStart.class, args);
		log.info("----DEBUG=={}",log.isDebugEnabled());
		log.info("----INFO=={}",log.isInfoEnabled());
		log.info("start successful!!!=======================");
	}

}
