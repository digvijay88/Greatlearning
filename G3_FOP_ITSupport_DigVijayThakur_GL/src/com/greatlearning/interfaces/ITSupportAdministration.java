/**
 * This interface shows it support abstract methods
 */
package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

/**
 * @author DigvijayThakur
 *
 */
public interface ITSupportAdministration {
	//abstract method for generate email address
	public  String generate_email_Address(String fname,String lname,String dept);
	//abstract method for set password
	public String set_password();
	//abstract method to display credentials
	public void show_credentials(Employee e);	
	

}
