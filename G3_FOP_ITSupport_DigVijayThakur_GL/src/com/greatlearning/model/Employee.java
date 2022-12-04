/**
 * This is Employee class is set and get values
 */
package com.greatlearning.model;

/**
 * @author DigVijayThakur
 *
 */
public class Employee {

	/**
	 * All data types variables
	 */
	private String fname;
	private String lname;
	private String dept;
	private String email;
	private String password;
	private int mailCapacity = 500;
	private String alter_email;
	//getter for firstname
	public String getFname() {
		return fname;
	}
	//setter for firstname
	public void setFname(String fname) {
		this.fname = fname;
	}
	//getter for lastname
	public String getLname() {
		return lname;
	}
	//setter for lastname
	public void setLname(String lname) {
		this.lname = lname;
	}
	//getter for department
	public String getDept() {
		return dept;
	}
	//setter for department
	public void setDept(String dept) {
		this.dept = dept;
	}
	//getter for email
	public String getEmail() {
		return email;
	}
	//setter for email
	public void setEmail(String email) {
		this.email = email;
	}
	//getter for password
	public String getPassword() {
		return password;
	}
	//setter for password
	public void setPassword(String password) {
		this.password = password;
	}
	//getter for mail capacity
	public int getMailCapacity() {
		return mailCapacity;
	}
	//setter for mail capacity
	public void setMailCapacity(int mailCapacity) {
		this.mailCapacity = mailCapacity;
	}
	//getter for alternate email
	public String getAlter_email() {
		return alter_email;
	}
	//setter for alternate email
	public void setAlter_email(String alter_email) {
		this.alter_email = alter_email;
	}

	

}
