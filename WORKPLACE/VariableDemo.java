// types of a variable


/*1.local variable : local variable is a variable that is declared within a method, constructor, or block of code
 and is only accessible within that method, constructor, or block. Local variables are not accessible outside the scope
in which they are declared*/


/* 2.instance variable : is a variable that is declared within a class but outside any method, constructor, or block   */


/* 3.static variable : is a variable that is declared with the static keyword inside a class but outside any method, constructor,
 or block. Static variables are associated with the class itself, rather than any specific instance of the class.
This means that all instances of the class share the same static variable.*/


public class VariableDemo {

    float a;        //decalartion of variable // instance variable

    public void add()   // local variable need to initiize compulsory
    {
        // int a;  // local variable

        System.out.println(a);
    }

    public static void main(String[] args) {
        VariableDemo vb=new VariableDemo();
        vb.add();

    }

}
