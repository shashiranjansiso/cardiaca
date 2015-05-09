package com.kerthy.parser;

public class Patient {
	private String Name;
	private String Dob;
	private String Gender;
	private int Age;
	private String Email;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public String toString()
	{
		String str = "'" + this.Name + "', '" + this.Dob.toString() + "', '" + this.Gender + "', " + this.Age + ", '" + this.Email + "'";
		return str;
		//'shashi','2011-03-12' , 'male', 22, 'shashiranjansiso@gmail.com'
		
	}
	
}
