/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 4-1
*
********************************************/

import java.util.*;
public class Convert {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter an ASCII code: ");
		int ascii = input.nextInt();
		
		// Storing input as char type
		char x = (char)ascii;
		
		// Output + Casting
		System.out.print("The character for ASCII code " + ascii + " is " + x);

	}

}
