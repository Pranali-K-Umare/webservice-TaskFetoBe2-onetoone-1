package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.enquiry;
import com.example.demo.model.panCardDetails;
import com.example.demo.repository.homePanrepository;
import com.example.demo.repository.homerepository;
import com.example.demo.servicei.homeservicei;
@Service
public class serviceimpl implements homeservicei{
	
	@Autowired
	homerepository hr;
	
	@Autowired
	homePanrepository hpr;
	
	
	@Override
	public void saveEnquiry(enquiry a)
	{
		hr.save(a);
	}
	
	@Override
	public Iterable<enquiry> displayAll()
	{
		return hr.findAll();
	}
	
	@Override
	public void deleteData(int eid)
	{
		enquiry ey	=hr.findAllByEid(eid);
		hr.delete(ey);
	}
	
	//pan
	@Override
	public void savepanDetail(panCardDetails a)
	{
		hpr.save(a);
	}

}
