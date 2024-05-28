public class Test1 {
    int a;
    int b;

    // Default constructor
    Test1() {
        this(10);           // Invokes the int constructor with value 10
        System.out.println("Im in a default constructor");
    }

    // Parameterized constructor with two parameters
    Test1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Im in a parameterized constructor");
    }

    // Parameterized constructor with one parameter
    Test1(int a) {
        this(10, 20); // Invokes the parameterized constructor with values 10 and 20
        System.out.println("Im in int constructor");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();                 // Creates an instance using the default constructor
        // Test1 t2 = new Test1(0, 0);         // to create an instance using the parameterized constructor
    }
}
