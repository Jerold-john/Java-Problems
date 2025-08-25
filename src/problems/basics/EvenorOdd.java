package problems.basics;

import java.util.Scanner;

public class EvenorOdd {
    public  static void main(String[] args){
        //Open Scanner
        Scanner scanner = new Scanner(System.in);
        //Declaring variable
        int num;
        //Reading a number from user
        System.out.println("Enter a Number : ");
        num = scanner.nextInt();
        //If the number reminder is zero when it is division by two - It is an even Number.
        //else - the Number is an Odd Number.
        if(num % 2 == 0){
            System.out.println(num+" is an Even Number.");
        }
        else{
            System.out.println(num+" is an Odd Number.");
        }
        //Close Scanner
        scanner.close();
    }
}
