/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 7-2
*
* Write a class ArrayMethods, where the main method asks the user to enter the number
* of inputs and stores them in an array called myList. Create a method printArray that prints the array
* myList. Create another method copyArray that copies the array using System.arraycopy, and
* multiplies each element in the copied array by 2, then finally returns the array to the main method.
* Invoke the printArray again to print the array returned by copyArray.
********************************************/

import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
		int[] myList;
		
		// Input
		System.out.print("Enter the number of items: ");
		int x = 0;
		
		// Creates an array with user input
		if(input.hasNextInt()) {
			x = input.nextInt();
		}
		myList = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.printf("Enter the numbers: ", " ", i + 1);
			if (input.hasNextInt()) {
				myList[i] = input.nextInt();
			}
		}
	    
		// calls methods
		System.out.print("Your printed array: ");
		printArray(myList);
		int[] copiedArray = copyArray(myList);
		System.out.print("\nYour copied (x2) printed array: ");
		printArray(copiedArray);
		}

	// printArray method
	public static void printArray(int[] myList) {
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
			}
		}
	
	// copyArray method
	public static int[] copyArray(int[] myList) {
		int[] copiedArray = new int[myList.length];
		
		// Copies array
		System.arraycopy(myList, 0, copiedArray, 0, myList.length);
		
		// Multiplies each number by 2
		for (int i = 0; i < copiedArray.length; i++){
			copiedArray[i] = copiedArray[i] * 2;
			}
		return copiedArray;
	}

}
