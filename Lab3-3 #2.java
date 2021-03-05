/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 3-3
* Recall from lab3-2, we wrote a class, NumberToMonth, which did the following. Now,
* this time, write a class called NumberToMonthUsingSwitch, that does the same but uses the switch statement.
********************************************/

import java.util.*;
public class NumberToMonthUsingSwitch {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
						
		// Input
		System.out.println("Enter the month of the year - number 1 to 12");
		int month = input.nextInt();
				
		// Switch statement
		switch(month) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is February");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is June");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
		default:
			System.out.println("Invalid input");
			System.exit(1);
		}	
	}
}
