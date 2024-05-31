package com.exavalu.customer.product.portal.entities.repository.mongodb;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.exavalu.customer.product.portal.entities.mongodb.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	List<Customer> findByEmailId(String emailId);

}
