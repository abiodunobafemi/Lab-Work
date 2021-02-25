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
public class AgeMessages {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("How old are you? ");
		int age = input.nextInt();
		
		
		// Output
		System.out.println("You are..");
		
		// Conditional Statements
		if (age < 13) {
			System.out.println("too young to create a Facebook account");
			}
		if (age < 16) {
			System.out.println("too young to get a driver's license");
			}
		if (age < 18) {
			System.out.println("too young to get a tattoo");
			}
		if (age < 21) {
			System.out.println("too young to drink alcohol");
			}
		if (age < 35) {
			System.out.println("too young to run for President of the U.S.");
			System.out.println("How sad!");
			}
		else {
			if (age >= 35) {
				System.out.println("able to do anything");
				System.out.println("How happy!");
				
				}
			}
	}
}
