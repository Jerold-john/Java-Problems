package problems.basics;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        //Open Scanner
        Scanner scanner = new Scanner(System.in);
        //Declaring Variables
        int num, sum = 0;
        //Reading a Number from User
        System.out.println("Enter a Number :");
        num = scanner.nextInt();

        while(num != 0){
            //When a Number is Divided by 10. Ex - 1234 / 10
            //Its Reminder will be the last digit of the number. Ex - 1234 % 10 = 4
            //Its Quotient will be remaining number other than last digit of number. Ex = 1234 / 10 = 123
            sum += num % 10;//It adds last digit in every iteration
            num /= 10;//For every iteration the number will decrease digit
        }
        //Displaying Sum of Digits
        System.out.println("Sum of Digit is "+sum);
        //Closing the Scanner
        scanner.close();
    }
}
