import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = calculateSumOfOddNumbers(n);
        System.out.println("Sum of first " + n + " odd natural numbers is: " + sum);
    }

    public static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        int count = 0;
        int number = 1;
        while (count < n) {
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
            number++;
        }
        return sum;
    }
}