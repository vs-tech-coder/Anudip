// Write a Java program to compare a given string to the specified character sequence.


import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine(); // User enters "Hello, World!"
        
        // Step 3: Prompt the user to enter the sequence to be compared
        System.out.print("Enter the sequence to compare: ");
        String sequence = scanner.nextLine(); // User enters "Hello, World!"
        
        // Step 4: Compare the main string to the specified sequence
        boolean isEqual = mainString.contentEquals(sequence);
        
        // Step 5: Display the result
        if (isEqual) {
            System.out.println("The main string is equal to the sequence.");
        } else {
            System.out.println("The main string is not equal to the sequence.");
        }
        
        // Step 6: Close the scanner
        scanner.close();
    }
}
