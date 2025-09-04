package problems.array;

import java.util.Scanner;

/*
    Step 1: Initialize a pointer
        Let pos = 0 → it will track where the next non-zero element should go.

    Step 2: Loop through the array
        For each element arr[i]:
        If arr[i] is not zero, place it at arr[pos] and increment pos.
        If arr[i] is zero → skip.

    Step 3: Fill remaining positions with zeros
        After placing all non-zero elements at the beginning,
        Fill arr[pos] to arr[length-1] with 0.
 */
public class MoveZeroToEnd {
    public static void main(String[] args){
        //Opening Scanner
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        //Read the size of array from user
        int size;
        System.out.println("Enter the Size of Array:");
        size = scanner.nextInt();

        //Declaring Array
        int[] arr = new int[size];
        System.out.println("Enter "+size+" Elements : ");
        //Reading Array Element from User
        for(int i = 0; i < size; i ++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < size; i++){
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        for(int i = pos; i < size; i++){
            arr[i] = 0;
        }
        //Displaying Array
        System.out.println("Array after zeros moved to the End : ");
        for(int i : arr){
            System.out.println(i);
        }
        scanner.close();
    }
}
