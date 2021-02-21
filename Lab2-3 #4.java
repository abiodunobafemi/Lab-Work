// Abiodun Obafemi

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
