import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        String dayName;     // Declare a variable to store the name of the day


        switch (dayNumber) {
            case 1:
                dayName = "Sunday"; // Assign "Sunday" if the input is 1
                break;
            case 2:
                dayName = "Monday"; // Assign "Monday" if the input is 2
                break;
            case 3:
                dayName = "Tuesday"; // Assign "Tuesday" if the input is 3
                break;
            case 4:
                dayName = "Wednesday"; // Assign "Wednesday" if the input is 4
                break;
            case 5:
                dayName = "Thursday"; // Assign "Thursday" if the input is 5
                break;
            case 6:
                dayName = "Friday"; // Assign "Friday" if the input is 6
                break;
            case 7:
                dayName = "Saturday"; // Assign "Saturday" if the input is 7
                break;
            default:
                dayName = "Invalid input"; // Assign "Invalid input" if the number is not between 1 and 7
                break;
        }

        System.out.println("The day corresponding to the number " + dayNumber + " is: " + dayName);

    }
}
