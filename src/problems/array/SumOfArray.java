package problems.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        //Open Scanner
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        //Read the size of array from user
        System.out.println("Enter the Size of Array :");
        int size = scanner.nextInt();
        //Declaring Array
        int[] arr = new int[size];
        System.out.println("Enter "+size+" Elements : ");
        //Reading Array Element from User
        for(int i = 0; i < size; i ++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        //Displaying the sum
        System.out.println("Sum of Array : "+sum);
        //Closing the Scanner
        scanner.close();
    }
}
