/********************************************
*
* Kean University
* Spring 2021
* Course: CPS*1231
*
* Author: Abiodun Obafemi
* Section: 08
* Assignment: Lab 7-extra
*
* Write a class ArrayClass, where the main method asks the user to enter the four numbers. Create a
* method printArray that prints the array whenever required (use Array.toString method).
********************************************/
import java.util.*;
public class ArrayClass {

	public static void main(String[] args) {
		
		// Declare
		Scanner input = new Scanner(System.in);
	     int[] list1 = new int[4];
	     int[] list2 = new int[4];
	     int[] list3 = new int[4];
	     
	     // Input
	     System.out.print("List1, Enter four numbers: ");
	     for (int i = 0; i < list1.length; i++) {
	    	 list1[i] = input.nextInt();
	    	 }
	     System.out.print("List2, Enter four numbers: ");
	     for (int i = 0; i < list2.length; i++) {
	    	 list2[i] = input.nextInt();
	    	 }
	     System.out.print("List3, Enter four numbers: ");
	     for (int i = 0; i < list3.length; i++) {
	    	 list3[i] = input.nextInt();
	    	 }
	     
	     // calls printArray method and prints each list
	     System.out.print("Your original List1: ");
	     printArray(list1);
	     System.out.print("Your original List2: ");
	     printArray(list2);
	     System.out.print("Your original List3: ");
	     printArray(list3);
	     
	     // Calls sort method and prints sorted List1 array with printArray method
	     System.out.print("Sorted List1 is: ");
	     Arrays.sort(list1);
	     printArray(list1);
	     
	     // Asks user for a number from the sorted List1 to search for
	     System.out.print("Enter a number from the sorted List1 to search for: ");
	     int searchList1 = input.nextInt();
	     
	     // Searches for number in sorted List1 and stores it in position variable
	     int position = Arrays.binarySearch(list1, searchList1);
	     
	     // prints value and index
	     System.out.println("Value " + searchList1 + " is in index " + position + " (or position 3)");
	     
	     // sorts each list
	     Arrays.sort(list1);
	     Arrays.sort(list2);
	     Arrays.sort(list3);
	     
	     // prints list that is the same when sorted after checking each
	     System.out.printf("List that are the same when sorted: ");
	     if(Arrays.equals(list1, list2)) {
	    	 printArray(list1);
	     }
	     else if(Arrays.equals(list2, list3)) {
	    	 printArray(list2);
	     }
	     else if(Arrays.equals(list1, list3)) {
	    	 printArray(list1);
	     }
	}
	
	// printArray method
	private static void printArray(int[] myList) {
		System.out.println(Arrays.toString(myList));
		}

}
