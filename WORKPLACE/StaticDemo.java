public class StaticDemo {

    static int a = 0;  // Static variable

    // Method to display and increment the static variable 'a'
    public void display() {
        a = a + 1;

        // Increment 'a' by 1
        System.out.println(a);
    }

    // Main method where program execution begins (1st step)
    public static void main(String[] args) {
        StaticDemo sd1 = new StaticDemo(); // Create an object of StaticDemo class (2nd step)
        sd1.display(); // Call the display method of the sd1 object (3rd step)

        StaticDemo sd2 = new StaticDemo(); // Create another object of StaticDemo class (7th step)
        sd2.display(); // Call the display method of the sd2 object (7th step)

        StaticDemo sd3 = new StaticDemo(); // Create yet another object of StaticDemo class (11th step)
        sd3.display(); // Call the display method of the sd3 object (11th step)

        // There are no more statements to execute, so the program ends
    }
}



//static op---> 1 2 3
//no static op---> 1 1 1



//flow of java program
//public class StaticDemo {
//
//    static int a=0; // static variable// class variable
//
//    public void display()              	//  4th step  8 step       	12step
//    {
//
//        a=a+1;                             // 5th step   9 step        	13 step
//        //a=3+1; a=3;
//        System.out.println(a);         	// 6 step a=0  10th step a=0	a=0 14step
//    }
//    //a=3;
//    public static void main(String[] args) {  //1 step
//        StaticDemo sd1=new StaticDemo();	//object created 2 step
//        sd1.display();                    // 3 step
//        StaticDemo sd2=new StaticDemo();
//        sd2.display();                    // 7th step
//        StaticDemo sd3=new StaticDemo();
//        sd3.display();                     //11th step
////any more statement - no
//
//        //then exit
//    }
//
//}






