package problems.basics;

import java.util.Scanner;

public class MultiplicationTable {
    public  static void main(String[] args){
        //Open scanner
        Scanner scanner = new Scanner(System.in);
        //Declare a Variable
        int num;
        //Reading a number from User
        System.out.println("Enter a Number : ");
        num = scanner.nextInt();

         for(int i = 1; i <= 16; i++){
             System.out.printf(" %d * %d = %d\n",i,num,i*num);
         }
        //Closing the scanner
        scanner.close();
    }
}
