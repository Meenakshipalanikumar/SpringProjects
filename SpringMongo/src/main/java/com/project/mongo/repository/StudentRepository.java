package com.project.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.mongo.model.Aexample;
@Repository
public interface StudentRepository extends MongoRepository<Aexample,ObjectId>{
	
}
