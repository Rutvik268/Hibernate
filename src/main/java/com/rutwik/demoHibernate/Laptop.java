package com.rutwik.demoHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Human> human = new ArrayList<>();

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	

	public List<Human> getHuman() {
		return human;
	}

	public void setHuman(List<Human> human) {
		this.human = human;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}

}
