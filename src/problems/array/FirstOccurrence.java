package problems.array;

import java.util.Scanner;
/*
    1. Loop through the array from start (index 0) to end.
    2. For each element, check if it equals the target.
    3. If it matches, return the current index immediately (first occurrence).
    4. If the loop finishes without finding the target → return -1 (not found).
 */
public class FirstOccurrence {
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
        //Reading target to check frequency
        System.out.println("Enter the Target to find the Frequency in Array :");
        int target = scanner.nextInt();
        for(int i : arr){
            if(i == target){
                System.out.println(target+" First Occurrence at index "+i);
                scanner.close();
                return;
            }
        }
        System.out.println(target+" is Not in the Array.");

        //Closing the Scanner
        scanner.close();
    }
}
