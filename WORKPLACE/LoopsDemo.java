public class LoopsDemo {

    public static void main(String[] args) {

        //for loop
        for(int i=1; i<=10; i++)        //Initialization ;  Condition  ;  Increment or Decrement Operator
        {
            System.out.println("Value of x = " + i);
        }


        //While Loop
        int a=10;

        while(a<20)         //here ; don't requires
        {
            System.out.println("Value of x = " + a);

            a++;
        }


        //do while loop

        do {
            System.out.println("Value of x = " + a);
            a++;

        }while(a < 20);      //here ;  requires


        // for each() advanced for loop
    }

}

