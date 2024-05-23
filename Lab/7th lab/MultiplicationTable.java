import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to display its multiplication table: ");
        int number = scanner.nextInt();
        scanner.close();

        displayMultiplicationTable(number);
    }

    public static void displayMultiplicationTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}