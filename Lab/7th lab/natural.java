//Write a Java program to display n terms of natural numbers and their sum.

import java.util.Scanner;

public class natural {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of terms");
            int a=sc.nextInt();
            int sum=0;
            for(int i=1; i<=a;i++){
                sum += i;
            }
System.out.println("the sum of first " + a + " natural number is " + sum);

    }
}
