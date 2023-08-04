package com.example.demo.servicei;

import com.example.demo.model.enquiry;
import com.example.demo.model.panCardDetails;

public interface homeservicei {
	
	public void saveEnquiry(enquiry a);
	public Iterable<enquiry> displayAll();
	public void deleteData(int eid);
	
	//pan
	
	public void savepanDetail(panCardDetails a);

}
