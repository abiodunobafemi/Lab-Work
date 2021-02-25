/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 3-1
*
********************************************/

import java.util.*;
public class VoteAge {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter your age in years: ");
		int age = input.nextInt();
		
		// Conditional Statements
		if (age >= 18) {
			System.out.print("You are " + age + " years old, old enough to vote.");
		}
		else {
			System.out.print("You are " + age + " years old, not old enough to vote.");
		}
	}

}
