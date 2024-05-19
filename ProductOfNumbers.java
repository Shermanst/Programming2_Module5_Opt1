import java.util.Scanner;  // Import Scanner class

public class ProductOfNumbers {
	// Recursive method to calculate the product of five numbers using an array
	public static int productOfArray(int[] numbers, int index) {
		// Base case: If index is the last element, return the number
		if (index == numbers.length -1) {
			return numbers[index];   // Return the last element
		}
		// Recursive case: Return the current number multiplied by the 
		// product of the remaining numbers
		return numbers[index] * productOfArray(numbers, index + 1);  
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);  // Create Scanner object for input
		int[] numbers = new int[5];  // Create array to store five numbers
		
		// Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) { // Loop to read five numbers
            while (true) { // Loop until a valid integer is entered
                System.out.print("Enter number " + (i + 1) + ": "); // Prompt for the number
                if (scnr.hasNextInt()) { // Check if the input is an integer
                    numbers[i] = scnr.nextInt(); // Store the valid integer in the array
                    break; // Exit the loop if a valid integer is entered
                } else {
                	// Print error message for invalid input
                	System.out.println("Invalid input. Please enter an integer."); 
                    scnr.next(); // Clear the invalid input
                }
            }
        }

        // Calculate the product of the numbers using the recursive method
        int result = productOfArray(numbers, 0); // Call the recursive method starting with index 0
        System.out.println("The product of the entered numbers is: " + result); // Print the result

        scnr.close(); // Close the scanner to free resources
    }
}
