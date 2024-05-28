// Class representing the main functionality of the program
public class Test4 {

    // Method to display messages and call the Show method
    void Display(){
        this.Show();                // 'this' keyword represents the current class instance
        System.out.println("Display method me huu"); // Print a message from the Display method
    }

    // Method to display a message
    void Show(){
        System.out.println("Show method me huu"); // Print a message from the Show method
    }


    public static void main(String[] args) {
        // Create an instance of the Test4 class
        Test4 t4 = new Test4();

        // Call the Display method on the instance
        t4.Display();
    }
}
