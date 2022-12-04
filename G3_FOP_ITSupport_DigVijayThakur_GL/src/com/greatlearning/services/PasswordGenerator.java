/**
 * This class generates random passwords
 */
package com.greatlearning.services;

import java.util.Random;

/**
 * @author Digvijay thakur
 *
 */
public class PasswordGenerator {
	public String generate_password(int length) {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allValues = capitalLetters + smallLetters 
				+ numbers + specialCharacters;
		
		Random randomObj = new Random();			
		String password="";
		
		for (int i=0; i < 8; i++) {

			int boundValue = allValues.length();//70
			int randomIndex = randomObj.nextInt(boundValue);//randomObj.nextValue(70) - between 0 and 70	
			char randomChar = allValues.charAt(randomIndex);//allValues.charAt(3)			
			password += String.valueOf(randomChar);//"D"
		}	
		//Dl0*w?#q
		return password;
	}

}
