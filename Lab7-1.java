/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 7-1
* Write a class called AnalyzeNumbers which asks the user to enter the number of inputs
* and stores them in an Array, then prints the Array that was inputted, calculates the sum of the
* numbers entered and prints the total numbers greater than the first inputted number
********************************************/

import java.util.*;
public class AnalyzeNumbers {

	public static void main(String[] args) {
		
		// Declare
		Scanner input =new Scanner(System.in);
		
		// Input
		System.out.print("Enter the number of items: ");
		int num = input.nextInt();
		float sum = 0;
		float a = 0;
		int count = 0;
		
		// Declare array
		float[] myList = new float[num];
		
		// Input array integers
		System.out.print("Enter the numbers: ");
		for(int i = 0; i < num; i++) {
			a = input.nextFloat();
			myList[i] = a;
		}
		
		// Converts integers to floats and prints what was inputted
		float b = myList[0];
		System.out.print("You inputted: ");
		for(int i = 0; i < num; i++) {
			if(myList[i] > b)
				count++;
			
			// Find sum of array
			sum = sum + myList[i];
			
			// Outputs integers inputted for the array
			System.out.print(myList[i] + " ");
		}
		
		// Output
		System.out.println("\nSum is: " + sum);
		System.out.println("Number of elements greater than the first element: " + count);

	}

}
