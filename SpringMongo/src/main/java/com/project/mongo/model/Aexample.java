package com.project.mongo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aexample")
public class Aexample {
	@Id
	public ObjectId _id;
	private String name;
	private String degree;
	private double age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Aexample(ObjectId _id, String name, String degree, double age) {
		this._id = _id;
		this.name = name;
		this.degree = degree;
		this.age = age;
	}

}
