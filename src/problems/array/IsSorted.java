package problems.array;

import java.util.Scanner;

public class IsSorted {
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
       for(int i = 0; i < size - 1; i++){
           if(arr[i] > arr[i+1]){
               System.out.println("This Array is Not Sorted.");
               scanner.close();
               return;
           }
       }
        System.out.println("This Array is Sorted.");
        //Closing the Scanner
        scanner.close();
    }
}
