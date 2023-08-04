package com.example.demo.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class enquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private String elname;
	private String emob;
	
	@OneToOne(cascade=CascadeType.ALL)
	private panCardDetails pd;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getElname() {
		return elname;
	}

	public void setElname(String elname) {
		this.elname = elname;
	}

	public String getEmob() {
		return emob;
	}

	public void setEmob(String emob) {
		this.emob = emob;
	}

	public panCardDetails getPd() {
		return pd;
	}

	public void setPd(panCardDetails pd) {
		this.pd = pd;
	}

}
