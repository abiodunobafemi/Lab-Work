// Abiodun Obafemi

import java.util.Scanner; // specific import

public class CelToFah {
	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);

		// Input
		System.out.println("Input the Celsius: ");
		double c = input.nextDouble();

		// Calculate
		double f = (9.0 / 5) * c + 32;

		// Output
		System.out.println(c + " Celsius is " + f + " Fahrenheit"); 
	}
}
