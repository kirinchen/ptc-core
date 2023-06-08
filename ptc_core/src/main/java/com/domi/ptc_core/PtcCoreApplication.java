package com.domi.ptc_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(basePackages = {"com.domi"})
@SpringBootApplication
public class PtcCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtcCoreApplication.class, args);
	}

}
