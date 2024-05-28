// Base class Sport

class Sport {

    public void play() {                    //method overriding
        System.out.println("I Play Sports");
    }
}

// Derived class Football that extends Sport
class Football extends Sport {

    @Override
    public void play() {                   //method overriding
        System.out.println("I play football");
    }
}

// Derived class Basketball that extends Sport
class Basketball extends Sport {

    @Override
    public void play() {                //method overriding
        System.out.println("I Play Basketball");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        // Creating an object of the Sport class and calling the play method
        Sport sport = new Sport();
        sport.play();

        // Creating an object of the Football class and calling the play method
        Football football = new Football();
        football.play();

        // Creating an object of the Basketball class and calling the play method
        Basketball basketball = new Basketball();
        basketball.play();
    }
}
