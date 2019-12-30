package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.RegData;


@Repository
public interface RegisterRepository extends CrudRepository<RegData,String>{

}
