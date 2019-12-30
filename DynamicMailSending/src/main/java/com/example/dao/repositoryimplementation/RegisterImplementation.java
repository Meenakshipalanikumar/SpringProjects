package com.example.dao.repositoryimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.RegData;
import com.example.demo.repository.RegisterRepository;

@Service
public class RegisterImplementation implements RepositoryService {
	
	@Autowired
	RegisterRepository rr;
	@Override
	public void insertUsers(RegData rd) {
		// TODO Auto-generated method stub
		rr.save(rd);
	}

}
