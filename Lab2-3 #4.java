// Abiodun Obafemi
// Write a class called MyCalculator2 which does the following:
// Look at the Sample Run below first which will help you understand better.
// Declare 4 variables as double type: inputa, inputb, inputc, total
// Declare 1 variable as int type: intPart
// Create a Scanner.
// Asks the user to enter input a, b, c. (note which line the user inputs)
// Calculate the result and store in the variable total.
// Use casting to show only the integer part of the result.
// Show the output.

import java.util.*;
public class MyCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare
		Scanner input = new Scanner(System.in);
		System.out.println("This program calculates (a + b) * c");
		
		// Input
		System.out.print("Enter input a: ");
		double inputa = input.nextDouble();
		System.out.print("Enter input b: ");
		double inputb = input.nextDouble();
		System.out.print("Enter input c: ");
		double inputc = input.nextDouble();
		
		// Calculate
		double result = (inputa + inputb) * inputc;
		int intPart = (int)result;
		
		// Output
		System.out.println("Result is " + result);
		System.out.println("Integer part is " + intPart);
	}

}
