// Abiodun Obafemi

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
