import java.util.Scanner;

public class AvgOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] arr = new int[size];

        // Ask the user to enter elements of the array

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int num : arr) {         //foreach loop
            sum += num;
        }

        // Display the sum
        System.out.println("Sum of the elements in the array: " + sum);

        // Calculate the average
        float average = (float) sum / size;

        // Print average
        System.out.println("Average value of the array elements is : " + average);


    }
}
