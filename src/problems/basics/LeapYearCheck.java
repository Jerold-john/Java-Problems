package problems.basics;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args){
        //open Scanner
        Scanner scanner = new Scanner(System.in);
        //Reading year from User
        System.out.println("Enter a Year : ");
        int year = scanner.nextInt();
        //Checking if Year is leap or Not
        if(year % 400 == 0){
            System.out.println(year+" is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year+" is Not a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year+" is a Leap Year.");
        }
        else{
            System.out.println(year+" is not a Leap Year.");
        }
        scanner.close();
    }
}
