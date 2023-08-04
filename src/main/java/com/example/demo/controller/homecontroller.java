package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.enquiry;
import com.example.demo.model.panCardDetails;
import com.example.demo.servicei.homeservicei;
@CrossOrigin("*")
@RestController
public class homecontroller {
	
	@Autowired
	homeservicei hsi;
	
	@PostMapping("/insertData")
	public String saveData(@RequestBody enquiry e)
	{
		hsi.saveEnquiry(e);
		return "saveData Succesfully";
	}
	
	@GetMapping("/getAll")
	public Iterable<enquiry> getAll()
	{
		Iterable<enquiry> list=hsi.displayAll();
		return list;
	}
	
	@PutMapping("/update/{eid}")
	public String update(@PathVariable("eid") int eid,@RequestBody enquiry a )
	{
		hsi.saveEnquiry(a);
		
		return "update Succesfully";
				
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteData(@PathVariable("eid") int eid )
	{
		hsi.deleteData( eid);
		
		return "update Succesfully";
				
	}
	
	
	
	//PancardDetauils
	
	@PostMapping("/savepan")
	public String SavePan(@RequestBody panCardDetails a)
	{
		hsi.savepanDetail(a);
		return "save Succesfully";
	}
	
//	@DeleteMapping("/delete/{pid}")
//	public String deleteDatap(@PathVariable("pid") int pid)
//	{
//		hsi.deleteDatap( pid);
//		
//		return "update Succesfully";
//				
//	}

}
