package problems.array;

import java.util.Scanner;
/*
    1. Maintain three variables: first, second, third → initialized to Integer.MIN_VALUE.
    2. Loop through the array:
            If current element > first → shift first to second, second to third, update first
            Else if current element > second → shift second to third, update second
            Else if current element > third → update third
 */
public class FindThreeLargest {
    public static void main(String[] args){
        //Opening Scanner
        Scanner scanner = new Scanner(System.in);
        //Declaring Variables
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        //Read the size of array from user
        int size;
        do {
            System.out.println("Enter the Size of Array:(More than 3 Elements)");
            size = scanner.nextInt();
        }while(size<3);
        //Declaring Array
        int[] arr = new int[size];
        System.out.println("Enter "+size+" Elements : ");
        //Reading Array Element from User
        for(int i = 0; i < size; i ++){
            arr[i] = scanner.nextInt();
        }
        for(int i : arr){
            if(i > first){
                third = second;
                second = first;
                first = i;
            } else if (i > second) {
                third = second;
                second = i;
            } else if (i > third) {
                third = i;
            }
        }
        //Displaying Largest three Elementd
        System.out.println("First Largest : "+first+"\nSecond Largest : "+second+"\nThird Largest : "+third);
        //Closing the Scanner
        scanner.close();
    }
}
