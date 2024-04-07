package com.example.CICDpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.example.CICDpipeline.controller")
@SpringBootApplication
public class CicdPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineApplication.class, args);
	}

}
