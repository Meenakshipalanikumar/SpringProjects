package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.doa.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

}
