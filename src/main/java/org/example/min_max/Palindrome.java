package org.example.lab1;

public class Palindrome {

    public int reverse(int number) {
        int result = 0;
        while(number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public void isPalindrome(int number, int rev_number) {
        if(number == rev_number)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }
}
