package problems.basics;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Declaring variables
        int num1, num2;

        //Reading two Numbers
        System.out.println("Enter First Number :");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number :");
        num2 = scanner.nextInt();

        //Displaying two Numbers
        System.out.println("Before Swapping : ");
        System.out.println("Number1 : "+num1);
        System.out.println("Number2 : "+num2);

        //Swapping two Numbers without using third variable
        num2 = num1 + num2;
        num1 =  num2 - num1;
        num2 = num2 - num1;

        //Displaying Swapped numbers
        System.out.println("After Swapping : ");
        System.out.println("Number1 : "+num1);
        System.out.println("Number2 : "+num2);
        scanner.close();
    }
}