/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 3-2
*
********************************************/

import java.util.*;
public class NumberToMonth {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
				
		// Input
		System.out.println("Enter the month of the year - number 1 to 12");
		int month = input.nextInt();
		
		// Checks for invalid input (i.e., numbers that are not from 1 to 12) and terminates the program
		// using System.exit(1) if input is invalid.
		if (month < 1 || month > 12) { 
			System.out.println("Invalid input");
			System.exit(1);
			}
		else {
			if (month == 1) {
				System.out.println("The month is January");
			}
			if (month == 2) {
				System.out.println("The month is February");
			}
			if (month == 3) {
				System.out.println("The month is March");
			}
			if (month == 4) {
				System.out.println("The month is April");
			}
			if (month == 5) {
				System.out.println("The month is May");
			}
			if (month == 6) {
				System.out.println("The month is June");
			}
			if (month == 7) {
				System.out.println("The month is July");
			}
			if (month == 8) {
				System.out.println("The month is August");
			}
			if (month == 9) {
				System.out.println("The month is September");
			}
			if (month == 10) {
				System.out.println("The month is October");
			}
			if (month == 11) {
				System.out.println("The month is November");
			}
			if (month == 12) {
				System.out.println("The month is December");
			}
	}

}
}
