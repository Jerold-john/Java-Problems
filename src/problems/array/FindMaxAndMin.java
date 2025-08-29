package problems.array;

import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args){
        //Open Scanner
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
        int min = arr[0], max = arr[0];
        for(int i : arr){
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        //Displaying min and Max value of Array
        System.out.println("Minimum Element : "+min);
        System.out.println("Maximum Element : "+max);
        //Closing the Scanner
        scanner.close();
    }
}
