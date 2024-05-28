public class PrintWithoutLoop {
    public static void main(String[] args) {

        int number = 1;                             // Initialize the starting number

        printNumbers(number);                   // Call the printNumbers method with the starting number


    }

    // Method to print numbers recursively without using loops
    public static void printNumbers(int num) {

        if (num <= 10) {                    // Check if the number is less than or equal to 10

            System.out.print(num + " "); // Print the current number

            printNumbers(num + 1); // Recursively call printNumbers with the next number
        }
    }
}
