package com.project.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.mongo.model.Aexample;
import com.project.mongo.repository.StudentRepository;

@RestController
public class MainController {
	@Autowired
	private StudentRepository sturep;

	@GetMapping(value = "/")
	public List<Aexample> getAllStudentdetails() {
		return sturep.findAll();
	}

}
