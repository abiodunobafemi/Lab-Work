// Abiodun Obafemi
// Write a class called TipCalculator which does the following:
// Look at the Sample Run below first which will help you understand better.
// Declare 2 variables as double type: amount and tip
// Declare a constant variable of double data type called TIP_RATE and assign 0.15
// Create a Scanner
// Asks the user to enter amount input. (note which line the user inputs)
// Calculate tip = amount * 0.15
// Show the output.

import java.util.*;

public class TipCalculator {
	public static void main(String[] args) {
		
		// Declare
		final double TIP_RATE = 0.15;
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter amount: "); double amount = input.nextFloat();
		
		// Calculate
		double calculatetip = amount * TIP_RATE;
		
		// Output
		System.out.print("Your amount is $" + amount + " and tip is $" + calculatetip);
		
	} 
}
