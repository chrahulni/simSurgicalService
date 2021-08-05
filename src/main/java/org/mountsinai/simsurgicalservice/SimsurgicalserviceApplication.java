package org.mountsinai.simsurgicalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SimsurgicalserviceApplication {

	static Logger logger = LoggerFactory.getLogger(SimsurgicalserviceApplication.class);
	
	
	public static void main(String[] args) {
		logger.debug("Starting SpringBoot Application - SimsurgicalserviceApplication");
		SpringApplication.run(SimsurgicalserviceApplication.class, args);
	}

}
