package problems.basics;

import java.util.Scanner;

public class MaximumOf3Numbers {
    public static void main(String[] args){
        //Open Scanner
        Scanner scanner = new Scanner(System.in);
        //Declare Variables
        int num1 , num2 , num3 ;
        //read three numbers from user
        System.out.println("Enter Three Numbers : ");
        System.out.print("Number1 : ");
        num1 = scanner.nextInt();
        System.out.print("Number2 : ");
        num2 = scanner.nextInt();
        System.out.print("Number3 : ");
        num3 = scanner.nextInt();
        //To find the largest value among three numbers
        //We need to compare one Number with other two Numbers.

        //If First Number is Greater than Second Number
        if(num1 > num2){
            //If First Number is Greater than Third Number
            if(num1 > num3){
                //First Number is Largest Number
                System.out.println(num1+" is the Largest Number.");
            }
            //If first number is less than Third Number
            else{
                //Third Number is the Largest Number
                System.out.println(num3+" is the Largest Number.");
            }
        }
        //If First Number is less than Second Number
        else{
            //If Second Number is Greater than Third Number
            if(num2 > num3){
                //second Number is the Largest Number
                System.out.println(num2+" is the Largest Number.");
            }
            //If Second Number id less than Third Number
            else{
                //Third Number is the Largest Number.
                System.out.println(num3+" is the Largest Number.");
            }
        }
        //closing scanner
        scanner.close();
    }
}
