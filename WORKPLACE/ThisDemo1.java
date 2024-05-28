// Class representing a Student
class Student {
    // Instance variables for the Student class
    int rollno;
    String name;
    Float fees;

    // Constructor to initialize the instance variables
    public Student(int rollno, String name, Float fees) {

        // 'this' keyword is used to refer to the current object's instance variables

        this.rollno = rollno;   // Assigning the parameter rollno to the instance variable rollno
        this.name = name;       // Assigning the parameter name to the instance variable name
        this.fees = fees;       // Assigning the parameter fees to the instance variable fees
    }

    // Method to display the details of the student
    void display(){
        System.out.println(rollno + " " + name + " " + fees); // Printing the rollno, name, and fees
    }
}


public class ThisDemo1 {
    public static void main(String[] args) {
        // Creating the first Student object and initializing it with rollno, name, and fees
        Student st = new Student(1, "Aniket", 125.0f);

        Student st2 = new Student(2, "Vaibhav", 254.4f);

        // Displaying the details of the first student
        st.display();

        st2.display();
    }
}
