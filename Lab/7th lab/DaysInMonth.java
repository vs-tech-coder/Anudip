import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.close();

        int days = getDaysInMonth(month, year);
        if (days != -1) {
            System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
        } else {
            System.out.println("Invalid month or year!");
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        int daysInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            default:
                daysInMonth = 31;
        }
        return daysInMonth;
    }
}