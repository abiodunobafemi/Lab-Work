/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 4-2
*
********************************************/

import java.util.*;
public class StudentTable {

	public static void main(String[] args) {
		
		// Prints the table
		System.out.print("////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n=============Student Points============= \n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////// \n");
		System.out.printf("%-10s%-10s%-10s%-10s\n", "Name", "Lab", "Bonus", "Total");
		System.out.printf("%-10s%-10s%-10s%-10s\n", "----", "---", "-----", "-----");
	    System.out.printf("%-10s%-10c%-10d%-10.1f\n", "Joe", 'C', 7, 50.5);
	    System.out.printf("%-10s%-10c%-10d%-10.1f\n", "William", 'B', 8, 58.2);
	    System.out.printf("%-10s%-10c%-10d%-10.1f\n", "Mary Sue", 'G', 10, 49.9);
	    
	}

}
