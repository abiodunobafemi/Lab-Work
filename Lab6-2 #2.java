/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 6-2
*
********************************************/

import java.util.*;
public class Repeat {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
		
		// Input
        System.out.println("Enter a character ");
        char a = input.nextLine().charAt(0);
        System.out.println("Enter a second character ");
        char b = input.nextLine().charAt(0);
        System.out.println("Enter the number of times to repeat ");
        int num = input.nextInt();
        
        // Calls printLine method
        printLine(a, b, num);
		}
	
	// Create printLine method
	public static void printLine(char a, char b, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(a + "" + b);
        }
        System.out.println();
    }
}
