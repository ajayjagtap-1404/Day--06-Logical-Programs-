package com.assigenement.day_6;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Enter number you want to check prime or not :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
        primeNumberChecker.findPrimeNumber(num);

    }
    void findPrimeNumber(int num) {
        if (num > 1) {
        int i = 1;
        boolean prime = false;
        while (i <= num/2) {
            i++;
            if (num % i == 0) {
                prime = true;
            }
        }
        if (prime == false) {
            System.out.println(num+ " number is prime ");
        } else {
            System.out.println(num+ " Not a prime number");
        }
    } else {
            System.out.println("Enter greater than 1 number :");
        }
    }
}
