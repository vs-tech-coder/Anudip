//Write a Java program to display the cube of the given number up to an integer.

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {

 
        int sum = 0; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int i=sc.nextInt();
        System.out.println("Enter the ending number");
        int l=sc.nextInt();
        for (i=0; i <=l; i++) { 
            sum += i * i * i;
        }
        System.out.println(sum); 
}
}
