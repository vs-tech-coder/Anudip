// Write a Java program that takes a student's grade as input and prints out a message indicating the corresponding grade


public class SwtichDemo {
    public static void main(String[] args) {

        char grade = 'A';

        // Use a switch statement to evaluate the grade
        switch (grade) {
            // Case for grade 'B'
            case 'B':
                System.out.println("Grade is B");
                break;
            // Case for grade 'A'
            case 'A':
                System.out.println("Grade is A");
                break;
            // Case for grade 'C'
            case 'C':
                System.out.println("Grade is C");
                break;

            // Default case if none of the above cases match
            default:
                System.out.println("Grade is not recognized");
                break;
        }
    }
}
