// Write a Java program to get the character at the given index within the string.


import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // User enters "Hello, World!"
        
        // Prompt the user to enter an index
        System.out.print("Enter an index: ");
        int index = scanner.nextInt(); // User enters 7
        
        // Check if the index is valid
        if (index < 0 || index >= inputString.length()) {
            // Length of inputString is 13, so index 7 is valid
            System.out.println("Invalid index. Please enter an index between 0 and " + (inputString.length() - 1));
        } else {
            // Get the character at the specified index
            char characterAtIndex = inputString.charAt(index); // inputString.charAt(7) is 'W'
            
            // Display the character
            System.out.println("The character at index " + index + " is '" + characterAtIndex + "'.");
            // Output: The character at index 7 is 'W'.
        }
        
        // Close the scanner
        scanner.close();
    }
}
