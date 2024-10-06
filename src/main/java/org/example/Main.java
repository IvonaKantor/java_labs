package org.example;

import org.example.lab1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);

        //task 1

        System.out.println("Enter a count of last names: ");
        int count = Integer.parseInt(in.nextLine());
        Blank blank = new Blank(count);

        while(true) {
            System.out.println("Enter last Name: ");
            String lastName = in.nextLine();

            if(lastName.equals("Blank")) {
                break;
            }
            blank.addLastName(lastName);
        }
        blank.printData();

        //task 2

        Palindrome palindrome = new Palindrome();
        System.out.println("Enter a number for the palidromic check :");
        int num = Integer.parseInt(in.nextLine());
        int reversed_num = palindrome.reverse(num);
        palindrome.isPalindrome(num, reversed_num);

        //task 3

        MinMax3 minmax = new MinMax3();
        System.out.println("Enter three-digit number: ");
        int number = in.nextInt();

        if(number < 100 || number > 999) {
            System.out.println("Invalid number");
            return;
        }

        while(true){
            int min = minmax.min_(number);
            System.out.println("The min number :" + min);

            int max = minmax.max_(number);
            System.out.println("The max number :" + max);

            int difference = max - min;
            System.out.println("The difference :" + difference);

            if(number == difference) {
                System.out.println("The numbers are equals.");
                break;
            }
        }

        //task 4

        MinMax4 minmax4 = new MinMax4();
        System.out.println("Enter four-digit number: ");
        int n = in.nextInt();

        if(n < 1000 || n > 9999) {
            System.out.println("Invalid number");
            return;
        }

        while(true){
            int min = minmax4.min(n);
            System.out.println("The min number :" + min);

            int max = minmax4.max(n);
            System.out.println("The max number :" + max);

            int difference = max - min;
            System.out.println("The difference :" + difference);

            if(n == difference) {
                System.out.println("The numbers are equals.");
                break;
            }
        }


        //task 5
        BattleShips battleShips = new BattleShips();
        battleShips.init();
        battleShips.print();

        in.close();
    }
}

















