
class Vehicle {

    public void startEngine() {
        System.out.println("Engine started");
    }
    
    
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}


class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }
    

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}


public class VehicleMain {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        car.startEngine();      
        car.stopEngine();       
        
        motorcycle.startEngine();  
        motorcycle.stopEngine();   
    }
}
