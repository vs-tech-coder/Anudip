// Parent class representing an Animal

class Animal1 {

    public void move() {
        System.out.println("The animal moves");
    }


    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}


// Subclass representing a Bird, extending Animal1
class Bird extends Animal1 {
    // Override method to describe bird movement
    @Override
    public void move() {
        System.out.println("The bird moves");
    }

    // Override method to describe bird sound
    @Override
    public void makeSound() {
        System.out.println("The bird makes a sound");
    }
}

// Subclass representing a Panther, extending Animal1
class Panther extends Animal1 {
    // Override method to describe panther movement
    @Override
    public void move() {
        System.out.println("The panther moves");
    }

    // Override method to describe panther sound
    @Override
    public void makeSound() {
        System.out.println("The panther makes a sound");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {

        // Create an instance of Bird
        Bird bird = new Bird();
        // Call methods to describe bird movement and sound
        bird.move();
        bird.makeSound();

        // Create an instance of Panther
        Panther panther = new Panther();
        // Call methods to describe panther movement and sound
        panther.move();
        panther.makeSound();
    }
}
