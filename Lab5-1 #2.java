/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 5-1
*
********************************************/

import java.util.*;
public class KiloToPoundTable {

	public static void main(String[] args) {
		
		// Declare
		int n = 1;
		
		// Output
		System.out.printf("%-12s%-12s", "Kilograms", "Pounds");
		
		// While loop
		while (n <= 15) {
			double kiloToPound = n * 2.20462;
			System.out.printf("\n%-12d%-12.1f", n, kiloToPound);
			n = n + 2;
		}
	}
}

