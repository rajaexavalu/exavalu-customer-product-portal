package com.exavalu.customer.product.portal.controller;

import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.exavalu.customer.product.portal.entities.mongodb.Customer;
import com.exavalu.customer.product.portal.entities.repository.mongodb.CustomerRepository;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoWriteException;

@RestController
@RequestMapping("v1/mongodb/customer")
public class CustomerController {

	private static final Logger log = LogManager.getLogger(CustomerController.class);
	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/search")
	public ResponseEntity<List<Customer>> getCustomer(@RequestParam(required = false) String emailId) {
		List<Customer> customers = null;
		if (emailId != null) {

			customers = customerRepository.findByEmailId(emailId);
			log.info("emailId: " + emailId);
		} else {
			customers = customerRepository.findAll();
		}

		return ResponseEntity.ok(customers);
	}

	@PostMapping("/create")
	public ResponseEntity<?> createCustomer(@RequestBody Customer newCustomer) {
		HashMap<String, String> response = new HashMap<>();

		try {
			customerRepository.save(newCustomer);
			String emailId = newCustomer.getEmailId();
			ResponseEntity<List<Customer>> fetchedCustomerList = getCustomer(emailId);

			if (fetchedCustomerList != null && fetchedCustomerList.getBody() != null) {
				List<Customer> customerList = fetchedCustomerList.getBody();
				for (Customer fetchedCustomer : customerList) {
					String customerId = fetchedCustomer.getCustomerId();
					response.put("CustomerId", customerId);
				}
			}
			response.put("emailId", emailId);
			response.put("msg", "Registeration successfull");
			
		} catch (Exception e) {
			if (e.getCause().toString().contains("code=11000")) {
				//code =11000 is of duplicate entry of uniqu index in mongodb
				response.put("msg", "Email Id already registered!");
				log.error(e.toString());
			}
				
			return ResponseEntity.status(400).body(response);
		}
		return ResponseEntity.ok(response);
	}
}
