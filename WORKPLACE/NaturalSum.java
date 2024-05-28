import java.util.Scanner;

/*
DRYRUN :

Enter the count of natural numbers: 3

Enter natural number 1: 5
Enter natural number 2: 10
Enter natural number 3: 15

loop start
1st iteration   sum +=num;  5 + 0 = 5
                            5 + 10 = 15
                            15 + 15 = 30

                            sum = 30


                            avg = sum/n
                                 =  30/3
                                 =  10

*/


public class NaturalSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //making scanner object to read input

        System.out.print("Enter the count of natural numbers: ");
        int count = scanner.nextInt();              // Read the input entered by user


                                            // Check if the count is a positive integer
        if (count <= 0) {
            System.out.println("Please enter a positive integer for the count.");

            return;
        }

        int sum = 0; // Initialize sum to 0

        for (int i = 1; i <= count; i++) {          // Loop to read the numbers

            System.out.print("Enter natural number " + i + ": ");

            int num = scanner.nextInt(); // Read the number entered by the user

            // Check if the entered number is positive
            if (num <= 0) {

                System.out.println("Please enter a positive number.");
                return;
            }
            sum += num; // Add the entered number to the sum
        }

        // Calculate the average of the entered natural numbers
        float average = (float) sum / count;

        System.out.println("Sum of the numbers: " + sum);

        System.out.println("Average of the numbers: " + average);
    }
}



