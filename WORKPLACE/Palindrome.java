//palindrome means  NAYAN    OR    12321

//check the number is palindrome or not



/*DRYRUN:

Enter the number :   12321

temp =12321

while loop start if num >0

1st iteration :   r = n % 10;                        // r = 12321 % 10 = 1

                  sum = (sum * 10) + r;             // sum = (0 * 10) + 1 = 1

                  n = n / 10;                       // n = 12321 / 10 = 1232


2nd iteration :   r = n % 10;                        // r = 1232 % 10 = 2

                  sum = (sum * 10) + r;             // sum = (1 * 10) + 2 = 12

                  n = n / 10;                       // n = 1232 / 10 = 123




after 5 iteration check temp == sum

equals --> palindrome

!equals --> not palindrome

 */


import java.util.Scanner;

class Palindrome{

    public static void main(String args[]){

        int r , sum=0 , temp;

        Scanner sc = new Scanner(System.in);             //making scanner object to read input

        System.out.println("Enter the number to check palindrome or not : ");

       int n = sc.nextInt();                             // Read the entered number

       temp=n;                                  //assign the value of n to temp varible

        while(n>0){

            r=n%10;

            sum=(sum*10)+r;

            n=n/10;

        }
        if(temp==sum)
            System.out.println(" It is a palindrome number ");
        else
            System.out.println("It is a not palindrome number");
    }
}


