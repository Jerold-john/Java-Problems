package problems.array;

import java.util.Scanner;
/*
    1. Initialize a counter to 0.
            This will keep track of how many times the target appears.

    2. Loop through each element in the array.
            Check if the current element equals the target.

    3. If it matches, increase the counter by 1.

    4. After finishing the loop, the counter holds the frequency of the target element
 */
public class CountFrequency {
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
        int count = 0 , target = scanner.nextInt();
        for(int i : arr){
            if(i == target){
                count++;
            }
        }
        if(count == 0){
            System.out.println(target+" is not in the Array!");
        }
        else{
            System.out.println(target+" "+target+" times Appeared.");
        }
        //Closing the Scanner
        scanner.close();
    }
}
