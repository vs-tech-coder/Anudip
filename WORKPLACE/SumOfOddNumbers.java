import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value n i.e. how many odd num should be add: ");
        int n = scanner.nextInt();

        // Check if 'n' is a positive integer
        if (n <= 0) {

            // Display an error message if 'n' is non-positive
            System.out.println("Please enter a positive integer for n.");
        } else {

            // Initialize variables to store the sum, count, and number
            int sum = 0;
            int count = 0;
            int number = 1;

            // Calculate the sum of the first 'n' odd natural numbers
            while (count < n) {
                sum += number;   // Add the current odd number to the sum
                number += 2;    // Increment the odd number by 2 to get the next odd number
                count++;       // Increment the count
            }

            // Display the sum of the first 'n' odd natural numbers
            System.out.println("Sum of the first " + n + " odd natural numbers is: " + sum);
        }

    }
}
