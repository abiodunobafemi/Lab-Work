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
public class AveMethod {

	public static void main(String[] args) {
		
		// Declare
		Scanner input =new Scanner(System.in);
		
		// Input
		System.out.print("Input the first number: ");
		double num1 = input.nextDouble();
		System.out.print("Input the second number: ");
		double num2 = input.nextDouble();
		System.out.print("Input the third number: ");
		double num3 = input.nextDouble();
		
		// Call threeAve method
		double average = threeAve(num1, num2, num3);
		System.out.println("The average is " + average);
		}

	
	// Create threeAve method to return average of the three inputs
	public static double threeAve(double num1,double num2,double num3) {
		
		// Adds three inputs and returns the average
		return (num1 + num2 + num3) / 3;
		   }
		       
	}
