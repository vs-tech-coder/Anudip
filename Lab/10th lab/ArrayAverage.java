// Write a Java program to calculate the average value of array elements.

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        double[] array = new double[size];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Calculate the sum of the array elements
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = sum / size;

        // Print the average
        System.out.println("The average value of the array elements is: " + average);

        scanner.close();
    }
}
