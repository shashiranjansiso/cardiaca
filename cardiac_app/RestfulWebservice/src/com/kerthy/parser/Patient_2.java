package com.kerthy.parser;

public class Patient_2 {
	private String lastname;
	private String mrn;
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMrn() {
		return mrn;
	}
	public void setMrn(String mrn) {
		this.mrn = mrn;
	}
	public String toString(){
		String res="LastName:"+this.getLastname()+" MRN:"+this.getMrn();
		return res;
	}
}
