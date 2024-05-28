import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();                      // Read the entered number

        if (number > 0) {                                     // Check  number is greater than 0

            System.out.println("The number is positive.");      // If positive, print

        } else if (number < 0) {                                 // If the number is less than 0

            System.out.println("The number is negative.");      // Print a message it is negative

        } else {

            System.out.println("The number is zero.");          //else num is zero
        }


    }
}
