// Interface Shape which defines the common properties and methods for different shapes


interface Shape {

    int len = 10;
    int bre = 11;
    int radius = 20;

    // Abstract method to get the area of the shape

    void getArea();

    // Class Rectangle1 implementing the Shape interface

    class Rectangle1 implements Shape {
        @Override
        public void getArea() {


            System.out.println("The area of rectangle is " + len * bre);
        }
    }

    // Class Triangle1 implementing the Shape interface

    class Triangle1 implements Shape {
        @Override
        public void getArea() {

            System.out.println("The area of triangle is " + 0.5 * len * bre);
        }
    }

    // Class Circle1 implementing the Shape interface

    class Circle1 implements Shape {
        @Override
        public void getArea() {

            System.out.println("The area of circle is " + 3.14 * radius * radius);
        }
    }
}


public class InferfaceExp3 {
    public static void main(String[] args) {

        // Create an instance of Rectangle1 and call its getArea method
        Shape rectangle = new Shape.Rectangle1();
        rectangle.getArea();

        // Create an instance of Triangle1 and call its getArea method
        Shape triangle = new Shape.Triangle1();
        triangle.getArea();

        // Create an instance of Circle1 and call its getArea method
        Shape circle = new Shape.Circle1();
        circle.getArea();
    }
}
