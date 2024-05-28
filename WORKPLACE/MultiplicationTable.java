/*

First Iteration (i = 1):
int product = n * i; calculates 5 * 1 = 5.
System.out.println(n + " * " + i + " = " + product); prints 5 * 1 = 5.

Second Iteration (i = 2):
int product = n * i; calculates 5 * 2 = 10.
System.out.println(n + " * " + i + " = " + product); prints 5 * 2 = 10

Enter an integer: 5
Multiplication table of 5:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50


*/


import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");

        int n = scanner.nextInt(); // Read the num enter by the user

        System.out.println("Multiplication table of " + n + ":");

        // Loop to generate the multiplication table from 1 to 10

        for (int i = 1; i <= 10; i++) {

            int product = n * i; // Calculate the product of n and i

            // Print the multiplication expression and result
            System.out.println(n + " * " + i + " = " + product);
        }


    }
}


