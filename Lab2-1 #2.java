// Abiodun Obafemi
// Write a class called CelToFah where a user inputs a Celsius degree in double type from the console, 
// then converts it to Fahrenheit and displays the results. Formula for the conversion is: fahrenheit = (9 / 5) * celsius + 32


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
