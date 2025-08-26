package problems.basics;

/*
Palindrome Check

Description:
A palindrome is a string or number that reads the same forward and backward.

Task:
- Write a program that checks whether a given string or number is a palindrome.
- Ignore spaces and letter case when checking strings.

Examples:
1. Input: "madam"   → Output: true
2. Input: "hello"   → Output: false
3. Input: 121       → Output: true
4. Input: 123       → Output: false
*/

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        //Open a scanner
        Scanner scanner = new Scanner(System.in);
        //Read String or number from user
        System.out.println("Enter Input :");
        String input = scanner.nextLine();

        if(input.matches("\\d+")){
            int num = Integer.parseInt(input);
            int org = num;
            int rev = 0;

            while(num!= 0){
                rev = rev * 10 + (num % 10);
                num /= 10;
            }

            if( rev == org){
                System.out.println(org+" is Palindrome.");
            }
            else{
                System.out.println(org+" is not Palindrome.");
            }
        }
        else{
            int left = 0;
            int right = input.length()- 1;
            String s = input.toLowerCase();
            while (left < right){
                if(s.charAt(left) != s.charAt(right)){
                    System.out.println(s+" is not Palindrome.");
                    return;
                }
                left++;
                right--;
            }
            System.out.println(s+" is Palindrome.");
        }
        //closing scanner
        scanner.close();
    }
}
