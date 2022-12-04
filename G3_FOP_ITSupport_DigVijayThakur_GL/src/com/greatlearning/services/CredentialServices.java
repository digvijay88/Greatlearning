package com.greatlearning.services;

import com.greatlearning.interfaces.ITSupportAdministration;
import com.greatlearning.model.Employee;

public class CredentialServices implements ITSupportAdministration{
   //specific implementation
	public CredentialServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generate_email_Address(String fname,String lname,String dept) {
		
		String email=fname+lname+"@"+dept+".gl.com";
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String set_password() {
		// TODO Auto-generated method stub
		PasswordGenerator passwordGenerator= new PasswordGenerator();
		return passwordGenerator.generate_password(8);
		
		
	}

	@Override
	public void show_credentials(Employee employee) {
		// TODO Auto-generated method stub
		//email, password
		System.out.println("Dear"+employee.getFname()+ "Your generated creadential are as below:");
		System.out.println("Email ID : " + employee.getEmail());
		System.out.println("Password : " +employee.getPassword());
		
	}

}
