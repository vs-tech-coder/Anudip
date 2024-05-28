import java.util.Scanner;

public class GreatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");           //first number
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");          //second number
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");           //third number
        int num3 = scanner.nextInt();

        int greatest;

        // Compare num1, num2, and num3 to find the greatest number
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        System.out.println("The greatest number is: " + greatest);

    }
}
