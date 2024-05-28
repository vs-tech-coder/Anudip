/*Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
Create two subclasses Car and  Motorcycle. Override the startEngine() and stopEngine() methods in each
 subclass to start and stop the engines differently.*/


class Vehicle1 {

    // Method startEngine
    public void startEngine() {
        System.out.println("Engine Start");
    }

    // Method  stopengine
    public void stopEngine() {
        System.out.println("Engine Stop");
    }
}

// Class car, which is a type of vehicle
class Car extends Vehicle1 {

    // Override the startEngine method for a car
    @Override
    public void startEngine() {
        System.out.println("The car engine starts ");
    }

    // Override the stopEngine method for a car
    @Override
    public void stopEngine() {
        System.out.println("The car engine stops ");
    }
}

// Class motorcycle, which is a type of vehicle
class Motorcycle extends Vehicle1 {
    // Override the startEngine method for a motorcycle
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine starts ");
    }

    // Override the stopEngine method for a motorcycle
    @Override
    public void stopEngine() {
        System.out.println("The motorcycle engine stops ");
    }
}

// Main class to demonstrate the use of the Vehicle1, Car, and Motorcycle classes
public class VehicleDemo {
    public static void main(String[] args) {
        // Create an instance of Car and start and stop its engine
        Car c = new Car();
        c.startEngine();
        c.stopEngine();

        // Create an instance of Motorcycle and start and stop its engine
        Motorcycle m = new Motorcycle();
        m.startEngine();
        m.stopEngine();
    }
}
