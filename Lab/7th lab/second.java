//Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class second {
        public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 1st number");
    int a=sc.nextInt();
    System.out.println("enter the 2nd number");
    int b=sc.nextInt();
    System.out.println("enter the 3rd number");
    int c=sc.nextInt();
    if(a<b){
    System.out.println("2nd number is greatest " + b);
    if(b<c){
        System.out.println("3rd number is greatest " + c);
    }
}
else{
    System.out.println("1st number is greatest " + a);
}

    }
}
