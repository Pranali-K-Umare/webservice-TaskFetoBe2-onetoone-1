package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class panCardDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public long getPmob() {
		return pmob;
	}
	public void setPmob(long pmob) {
		this.pmob = pmob;
	}
	private String pno;
	private long pmob;
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}

}
