package com.rutwik.demoHibernate;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "humans_N")
public class Human {

	@Id
	private int hid;
	@Column(name = "Human_name")
	private HumanName hname;
	private int hage;
	
	@ManyToMany(mappedBy="human")
	private List<Laptop> laptop = new ArrayList<Laptop>();

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public HumanName getHname() {
		return hname;
	}

	public void setHname(HumanName hname) {
		this.hname = hname;
	}

	public int getHage() {
		return hage;
	}

	public void setHage(int hage) {
		this.hage = hage;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Human [hid=" + hid + ", hname=" + hname + ", hage=" + hage + "]";
	}

}
