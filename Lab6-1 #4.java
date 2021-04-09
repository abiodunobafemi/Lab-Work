/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 6-1
*
********************************************/

import java.util.*;
public class LoopMethod { 
	
	public static void main(String[] args) {
		// Declare
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Input start number: ");
		int num1 = input.nextInt();
		System.out.print("Input end number: ");
		int num2 = input.nextInt();
		
		// Call printNums method
		printNums(num1, num2);
	}
		 
	// Create printNums method that receives start and end number then prints from the start to the end number
	public static void printNums(int num1, int num2) {
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
			}
		}
	}
