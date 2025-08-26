package problems.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        //Open Scanner
        Scanner scanner = new Scanner(System.in);
        //Declare Variables
        int n , prev = 0 , next = 1, fact;
        //Reading the Number of Fibonacci sequence to be Printed
        System.out.println("Enter the No. of Term to Display :");
        n = scanner.nextInt();
        //Displaying Fibonacci Sequence
        System.out.println("Displaying Fibonacci Sequence :");
        for(int i = 0; i < n; i++){
            fact = prev;
            System.out.println(i+1 +"."+fact);
            prev = next;
            next += fact;
        }
        scanner.close();
    }
}
