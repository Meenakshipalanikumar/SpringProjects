package com.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.doa.Customer;
import com.mapping.repository.CustomerRepository;
import com.mapping.repository.ProductRepository;

@RestController
public class OrderController {
	@Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
	
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
    @PostMapping("/insert")
    public Customer insertData( Customer cs) {
    	return customerRepository.save(cs);
    }
	
}
