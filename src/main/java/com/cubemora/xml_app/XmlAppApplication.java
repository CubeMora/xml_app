package com.cubemora.xml_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class XmlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlAppApplication.class, args);
	}

	

}
