
/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 5-2 #3
* Write a class called NestedLoop that prints the below. Use a for nested loop. No credit if nested loop is not used.
* 1
* 22
* 333
* 4444
* 55555
********************************************/

import java.util.*;
public class NestedLoop {

	public static void main(String[] args) {
		
		// Declare
		int n = 5;
		
		// For nested loop and output
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) 
				System.out.print(i);
			System.out.println(); // to go to next line
	       }
	   }
	}
