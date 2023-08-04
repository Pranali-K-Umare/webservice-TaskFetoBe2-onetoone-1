package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.enquiry;

public interface homerepository extends CrudRepository<enquiry, Integer> {
	
	
	public enquiry findAllByEid(int eid);

}
