import java.util.Scanner;

/*
        Enter the Positive Integer : 5

        while (5<0){

        Factorial = factorial * i ;
         i - -;
        }

        1 * 5 = 5
        5 * 4 = 20
        20 * 3 = 60
        60 * 2 = 120
        120 * 1 = 120


        The Factorial of 5 is 120
 */


public class FactorialCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input - ensure the entered number is positive

        while (number < 0) {
            System.out.print("Invalid input. Please enter a positive integer: ");
            number = scanner.nextInt();
        }

        // Calculate factorial
        long factorial = 1;
        int i = number;
        while (i > 0) {             //while loop

            factorial *= i;
            i--;
        }

        // Print the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);

    }
}


