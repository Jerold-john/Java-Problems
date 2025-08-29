package problems.array;

import java.util.Scanner;

public class ReverseAnArray {
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
            ;
        }
        //Displaying the Array Elements in Reverse
        System.out.println("Array in Reverse : ");
        for(int i = size-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        //Closing the Scanner
        scanner.close();
    }
}
