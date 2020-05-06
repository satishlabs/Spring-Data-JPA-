package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.dto.OrderRequest;
import com.spring.jpa.dto.OrderResponse;
import com.spring.jpa.entity.Customer;
import com.spring.jpa.repository.CustomerRepository;
import com.spring.jpa.repository.ProductRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation(){
		return customerRepository.getJoinInformation();
		
	}
	
}
