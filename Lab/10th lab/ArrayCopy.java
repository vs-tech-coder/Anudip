// Write a Java program to copy an array by iterating the array.

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the original array
        int[] originalArray = new int[size];

        // Get the array elements from the user
        System.out.println("Enter the elements of the original array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // Initialize the copy array
        int[] copyArray = new int[size];

        // Copy elements from the original array to the copy array
        for (int i = 0; i < size; i++) {
            copyArray[i] = originalArray[i];
        }

        // Print the original and copied arrays
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        System.out.println("Copied array:");
        for (int i = 0; i < size; i++) {
            System.out.print(copyArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
