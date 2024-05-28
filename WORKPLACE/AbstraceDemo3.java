abstract class Vehicle
{
   abstract void Wheels();      //abstract method

    void display(){              //contrete method
        System.out.println("HAS Big display");
    }

}
class car extends Vehicle
{
    @Override
    void Wheels() {                //method
        System.out.println("Car has 4 wheels");

    }

}
class Bycicle extends Vehicle
{
    @Override
    void Wheels() {
        System.out.println("Bicycle has 2 vehicle");

    }
}
class Auto extends  Vehicle
{
    @Override
    void Wheels() {
        System.out.println("Auto has 3 wheels");
    }
}

public class AbstraceDemo3 {
    public static void main(String[] args) {

        Vehicle v = new car();
        v.Wheels(); // Calls overridden method in Car class
        v.display(); // Calls method from Vehicle class

        Bycicle b = new Bycicle();
        b.Wheels(); // Calls method from Bicycle class

        Auto a = new Auto();

        a.Wheels(); // Calls method from Auto class
        b.display(); // Calls method from Vehicle class

    }
}
