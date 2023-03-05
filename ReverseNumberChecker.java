package com.assigenement.day_6;

import java.util.Scanner;

public class ReverseNumberChecker {
     int rev = 0, rem = 0;

    public static void main(String[] args) {
        System.out.println("Enter number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        ReverseNumberChecker ob = new ReverseNumberChecker();
        ob.reverseANumber(num);
        System.out.println("Reverse number is : " + ob.rev);
    }

    public void reverseANumber(int num) {

        while (num > 0) {
            rem = num % 10; // to store last digit number
            rev = rev * 10 + rem; // last number goes first position
            num = num / 10; // remove last digit
        }


    }
}