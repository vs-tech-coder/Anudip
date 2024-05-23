import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        
        if(number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
       
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
