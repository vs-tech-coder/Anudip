public class Test3 {
    // Data types

    // Primitive types: int, byte, long, short
    // Reference types: String (class), Test3 (class)

    int a;       // Instance variable 'a'
    int b;      // Instance variable 'b'

    // Constructor to initialize instance variables

    Test3(){
        a = 10;
        b = 20;
    }

    // Method to display the values of 'a' and 'b'

    void display(Test3 t1){                //Accepts an instance of Test3 (t1) as a parameter.

        System.out.println("a = " + a + "   " + "b = " + b);
    }

    // Method to call the display method using 'this'

    void get() {
        display(this); // Call the display method, passing the current object as an argument
    }

    public static void main(String[] args) {

        // Create an instance of the Test3 class
        Test3 t3 = new Test3();

        // Call the get method on the instance
        t3.get();
    }
}
