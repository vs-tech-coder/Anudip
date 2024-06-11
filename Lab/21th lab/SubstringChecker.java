// Write a Java program to test if a given string contains the specified sequence of char values.

import java.util.Scanner;

public class SubstringChecker {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine(); // User enters "Hello, World!"
        
        // Step 3: Prompt the user to enter the sequence to be checked
        System.out.print("Enter the sequence to check: ");
        String sequence = scanner.nextLine(); // User enters "World"
        
        // Step 4: Check if the main string contains the specified sequence
        boolean containsSequence = mainString.contains(sequence);
        
        // Step 5: Display the result
        if (containsSequence) {
            System.out.println("The main string contains the sequence.");
        } else {
            System.out.println("The main string does not contain the sequence.");
        }
        
        // Step 6: Close the scanner
        scanner.close();
    }
}
