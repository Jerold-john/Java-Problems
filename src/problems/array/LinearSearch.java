package problems.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        //Opening Scanner
        Scanner scanner = new Scanner(System.in);
        //Read the size of array from user
        System.out.println("Enter the Size of Array :");
        int size = scanner.nextInt();
        //Declaring Array
        int[] arr = new int[size];
        System.out.println("Enter "+size+" Elements : ");
        //Reading Array Element from User
        for(int i = 0; i < size; i ++){
            arr[i] = scanner.nextInt();
        }
        //Enter target value
        System.out.println("Enter the Target Value : ");
        int target = scanner.nextInt();
        for(int j: arr){
            if(target == j){
                scanner.close();
                System.out.println(target+" is Found.");
                return;
            }
        }
        System.out.println(target+" is not Found.");
        //Closing the Scanner
        scanner.close();
    }
}
