// Write a Java program to concatenate a given string to the end of another string.

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine(); // User enters "Hello"
        
        // Step 3: Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine(); // User enters "World"
        
        // Step 4: Concatenate the second string to the end of the first string
        String concatenatedString = firstString + secondString;
        
        // Step 5: Display the concatenated string
        System.out.println("The concatenated string is: " + concatenatedString);
        
        // Step 6: Close the scanner
        scanner.close();
    }
}
