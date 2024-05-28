//WAP to check the character is vowel or consonent.


import java.util.Scanner; // Import the Scanner class to read input from the user

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Enter the Character");
        String input = sc.next().toLowerCase();

        // Ensure that the input has only one character
        if (input.length() != 1) {
            System.out.println("Please enter a single character.");
        } else {
            char ch = input.charAt(0); // Get the first character of the input

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            } else if (Character.isLetter(ch)) { // Check if the character is a consonant
                System.out.println(ch + " is a consonant");
            } else {
                System.out.println("Invalid input. Please enter an alphabetic character."); // Handle non-alphabetic input
            }
        }

        sc.close(); // Close the scanner to free up resources
    }
}
