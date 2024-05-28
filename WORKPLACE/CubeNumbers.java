import java.util.Scanner;

/*
        Enter an integer: 3
        Cube of numbers up to 3:
        1^3 = 1
        2^3 = 8
        3^3 = 27

 */


public class CubeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Check if the entered integer is positive
        if (n <= 0) {

            System.out.println("Please enter a positive integer.");
        } else {

            // If the integer is positive, print the cube of numbers up to n
            System.out.println("Cube of numbers up to " + n + ":");

            for (int i = 1; i <= n; i++) {
                // Calculate the cube of the current number (i)

                int cube = i * i * i;

                // Print the cube of the current number
                System.out.println(i + "^3 = " + cube);
            }
        }

    }
}
