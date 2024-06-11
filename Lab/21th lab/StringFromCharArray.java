// Write a Java program to create a String object with a character array.


import java.util.Scanner;

public class StringFromCharArray {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Prompt the user to enter the length of the character array
        System.out.print("Enter the length of the character array: ");
        int length = scanner.nextInt(); // User enters 5
        scanner.nextLine(); // Consume the newline character
        
        // Step 3: Initialize the character array
        char[] charArray = new char[length];
        
        // Step 4: Prompt the user to enter characters for the array
        System.out.println("Enter the characters for the array:");
        for (int i = 0; i < length; i++) {
            charArray[i] = scanner.nextLine().charAt(0); // User enters 'H', 'e', 'l', 'l', 'o'
        }
        
        // Step 5: Create a String object from the character array
        String str = new String(charArray);
        
        // Step 6: Display the created string
        System.out.println("The created string is: " + str);
        
        // Step 7: Close the scanner
        scanner.close();
    }
}
