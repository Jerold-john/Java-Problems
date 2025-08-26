package problems.basics;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args){
        //Opening Scanner
        Scanner scanner = new Scanner(System.in);
        //Declare Variable
        int num, flag = 0;
        //Reading a NUmber from User
        System.out.println("Enter a Number :");
        num = scanner.nextInt();
        if(num == 1){
            System.out.println(num+" is not a prime nor a composite Number");
            return;
        }
        for(int i = 2; i <= (num)/2; i++ ){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if ( flag == 1){
            System.out.println(num+" is not A Prime Number.");
        }
        else{
            System.out.println(num+" ia a Prime Number.");
        }
        //Closing the Scanner
        scanner.close();
    }
}
