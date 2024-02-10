package com.rutwik.demoHibernate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class HumanName {
	
	private String fname;
	private String mname;
	private String lname;

	// Getters and Setters

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "HumanName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	
	

}
