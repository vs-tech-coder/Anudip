import java.util.Scanner;

public class ArrayElementAtIndex {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index to find the element: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < array.length) {
            System.out.println("Element at index " + index + " is: " + array[index]);
        } else {
            System.out.println("Invalid index! Please enter a valid index within the range of the array.");
        }
        
        
    }
}
