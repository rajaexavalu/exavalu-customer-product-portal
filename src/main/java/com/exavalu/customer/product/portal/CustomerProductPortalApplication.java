package com.exavalu.customer.product.portal;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerProductPortalApplication {
	
	private static final Logger log = LogManager.getLogger(CustomerProductPortalApplication.class);
	public static void main(String[] args) {
		log.info("Exavalu Customer Product Portal server has been started...");
		SpringApplication.run(CustomerProductPortalApplication.class, args);
	}

}
