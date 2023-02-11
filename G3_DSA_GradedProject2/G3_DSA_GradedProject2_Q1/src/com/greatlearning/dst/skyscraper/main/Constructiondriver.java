/**
 * class show skyscraper construction
 */
package com.greatlearning.dst.skyscraper.main;



/**
 * @author G3-B2
 *
 */

import java.util.*; 

public class Constructiondriver {     
    public static void main(String args[]) {   

		// import scanner class to accept the input from the user
        Scanner data = new Scanner(System.in);   

		// accept the total no.of floors available
        System.out.println("Enter the total number floors in the building : "); 
        int n = data.nextInt(); 
		
		// declare an array to store the size of each floor
        int days[] = new int[n+1]; 
        
		// iterate through 1 to n floors/ days
        for(int j=1;j<=n;j++){ 

			// accept the size of the floor
            System.out.println("Enter the floor size given on day : "+j);             
            int size = data.nextInt(); 

			// store the day in the array with the index of the size of the floor
            days[size]=j; 
        }
        
		// declare a temporary variable variable
        int temp = n;  

		// declare a flag variable to check the condition when required.
        int flag;        
        System.out.println("The order of construction is as follows ");
			
		// iterate through 1 to n floors/ days
        for(int j=1;j<=n;j++){

			// initialise flag to 0 for each iteration
            flag=0;             
            System.out.println("Day "+j+" :"); 

			// find the floor with the highest size available
            while( temp >=1 && days[temp] <= j){

				// update the flag
                flag = 1; 

				// print the floor
                System.out.print(temp +" ");

				// find the next highest floor available
                temp--;             
            }

			// if flag is updated
            if(flag==1)

					// proceed to the next day
                    System.out.println();             
        }     
        
    } 
    
}