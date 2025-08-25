package problems.basics;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args){
        //Open Scanner
        Scanner scanner = new Scanner(System.in);
        //declare variables
        int num , fact = 1 ;
        //Reading a number from User
        System.out.println("Enter a Number : ");
        num = scanner.nextInt();
        //To find the factorial of 5 - 5! = 5 * 4 * 3 * 2 * 1 = 120
        for(int i = num; i > 1; i--){
            fact *= i;
        }
        //Displaying the factorial of The Number
        System.out.println("Factorial of "+num+" is "+fact);
        //Closing Scanner
        scanner.close();
    }
}
