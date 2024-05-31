package com.exavalu.customer.product.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	@GetMapping("/")
	public String helloworld() {
		return "helloworld";
	}

}
