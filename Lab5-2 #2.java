/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 5-2 #2
*
* Write a class called ListOddNumbers that prints the below. (Note: there is a single space between each number).
*
* Printing odd numbers between 1 and 50
* 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
********************************************/

import java.util.*;
public class ListOddNumbers {

	public static void main(String[] args) {
		
		// Output
		System.out.println("Printing odd numbers between 1 and 50");
		
		// For loop
		for (int i = 1; i <= 50; i++) {
			
			// if statement in for loop
			if(i % 2 != 0) {
				System.out.print(i + " ");
				}
		}		
	}
}
