import java.util.Scanner;

/*  DRYRUN

Enter the value of n: 5

        The value of n is 5.
        Check if n is greater than 0, so continue.
        Initialize sum to 0.

Print the first 5 natural numbers:
        1st iteration: i = 1 print 1 sum = 1.
        2nd iteration: i = 2 print 2 sum = 3.
        3rd iteration: i = 3 print 3 sum = 6.
        4th iteration: i = 4 print 4 sum = 10.
        5th iteration: i = 5 print 5 sum = 15.

Print the sum of the first 5 natural numbers: The sum of the first 5 natural numbers is: 15.*/


public class NaturalNumbersSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of n: ");

        int n = scanner.nextInt();               // Read the integer entered by the user


        // Check if the entered value of n is a positive integer
        if (n <= 0) {

            System.out.println("Please enter a positive integer for n.");

        } else {

            int sum = 0;            // Initialize the sum to 0

            System.out.print("The first " + n + " natural numbers are: ");

            // Loop to print the first n natural numbers and calculate their sum

            for (int i = 1; i <= n; i++) {

                System.out.print(i + " "); // Print each natural number

                sum += i; // Add the current number to the sum
            }

            // Print the sum of the first n natural numbers

            System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
        }


    }
}



