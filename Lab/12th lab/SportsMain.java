
class Sports {
    
    public void play() {
        System.out.println("Playing a sport");
    }
}


class Football extends Sports {
        @Override
    public void play() {
        System.out.println("Playing football");
    }
}


class Basketball extends Sports {
        @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports {
    
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}


public class SportsMain {
    public static void main(String[] args) {
        Sports sport1 = new Football();
        Sports sport2 = new Basketball();
        Sports sport3 = new Rugby();
        
        sport1.play(); 
        sport2.play(); 
        sport3.play(); 
    }
}
