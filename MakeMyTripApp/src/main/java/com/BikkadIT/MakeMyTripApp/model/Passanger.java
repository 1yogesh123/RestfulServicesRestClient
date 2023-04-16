package com.BikkadIT.MakeMyTripApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passanger {

	@Id
	private int id;
	
	private String fname;
	
	private String lname;
	
	private String f;
	
	private String t;
	
	private String doj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Passanger [id=" + id + ", fname=" + fname + ", lname=" + lname + ", f=" + f + ", t=" + t + ", doj="
				+ doj + "]";
	}
	
	
	
	
	
}
