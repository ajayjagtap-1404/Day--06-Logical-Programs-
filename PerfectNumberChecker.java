package com.assigenement.day_6;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        System.out.println("enter number to check :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
        perfectNumberChecker.checkPerfectNumber(num);


    }

   void checkPerfectNumber(int num) {
        int temp = 0;
        for (int i=1; i <= num/2; i++) {
            if (num % i == 0) {
                temp = temp + i;
            }
        }
            if (temp == num) {
                System.out.println(num + " is a Perfect number ");
            } else {
                System.out.println(num + " is not a Perfect number ");
            }

    }
}
