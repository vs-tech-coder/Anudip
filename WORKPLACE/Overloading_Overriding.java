public class Overloading_Overriding {
    // Method
    public void add(int a, int b) {              //Method Overloading

        int result = a + b;

        System.out.println(result);
    }

    // Method
    public void add(int a, int b, int c) {          //Method Overloading

        int result = a + b + c;

        System.out.println(result);
    }

    // Method
    public void add(float a, int b, int c) {         //Method Overloading

        float result = a + b + c;

        System.out.println(result);
    }

    // Inner class extending Operation class
    static class Operation2 extends Overloading_Overriding {

                                                 // Method overriding
        public void add(int a, int b) {

            int result = a + b;

            System.out.println(result);
        }

                                                // Method overriding
        public void add(int a, int b, int c) {

            int result = a + b + c;

            System.out.println(result);
        }
                                                // Method overriding
        public void add(float a, int b, int c) {

            float result = a + b + c;

            System.out.println(result);

        }
    }

    public static void main(String[] args) {
        Overloading_Overriding op = new Overloading_Overriding(); // Create an instance of  class

        op.add(5, 6);               // Call add method with two integers

        op.add(4, 5, 6);        // Call add method with three integers

        op.add(5.4f, 4, 5);     // Call add method with a float and two integers


        Operation2 o2 = new  Operation2();

        o2.add(5, 6);               // Call add method with two integers

        o2.add(4, 5, 6);        // Call add method with three integers

        o2.add(5.4f, 4, 5);     // Call add method with a float and two integers



    }
}
