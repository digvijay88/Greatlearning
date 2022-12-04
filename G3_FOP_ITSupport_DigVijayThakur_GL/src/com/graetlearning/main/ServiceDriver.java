/**
 * This class run all main functions
 */
package com.graetlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialServices;

/**
 * @author Digvijay Thakur
 *
 */
public class ServiceDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// entry point to the app
		//user input options for department;
		Employee demoEmployee =new Employee();
		Scanner userInput= new Scanner(System.in);
		System.out.println("Please Enter your First Name\n");
		String fname= userInput.nextLine();
		demoEmployee.setFname(fname);
		System.out.println("Please Enter your Last Name\n ");
		String lname= userInput.nextLine();
		demoEmployee.setLname(lname);
		
		CredentialServices credentialServices = new CredentialServices();
		//user input options departments
		System.out.println("Please choose the department from the following options");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.legal");
		System.out.println("Please enter the dept option\n");
		int option =userInput.nextInt();
		String generatedEmail="null";
		String generatedPassword="null";
		
		switch(option) {
		case 1: {
			//dept is technical, short form is tech
			generatedEmail = credentialServices.generate_email_Address(demoEmployee.getFname().toLowerCase(),
										demoEmployee.getLname().toLowerCase(), "tech");
			generatedPassword = credentialServices.set_password();
			break;
		}
		case 2: {
			//dept is Admin, short form is adm
			generatedEmail = credentialServices.generate_email_Address(demoEmployee.getFname().toLowerCase(),
										demoEmployee.getLname().toLowerCase(), "adm");
			generatedPassword = credentialServices.set_password();
			break;
		}
		case 3: {
			//dept is HR, short form is hr
			generatedEmail = credentialServices.generate_email_Address(demoEmployee.getFname().toLowerCase(),
										demoEmployee.getLname().toLowerCase(), "hr");
			generatedPassword = credentialServices.set_password();
			break;
		}
		case 4: {
			//dept is Legal, short form is lg
			generatedEmail = credentialServices.generate_email_Address(demoEmployee.getFname().toLowerCase(),
										demoEmployee.getLname().toLowerCase(), "lg");
			generatedPassword = credentialServices.set_password();
			break;
		}
		default : {
			System.out.println("Enter a valid department option");
		}
	}
	
	demoEmployee.setEmail(generatedEmail);
	demoEmployee.setPassword(generatedPassword);
	credentialServices.show_credentials(demoEmployee);
}
}
