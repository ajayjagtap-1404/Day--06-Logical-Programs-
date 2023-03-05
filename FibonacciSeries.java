package com.assigenement.day_6;
import java.util.Scanner;
public class FibonacciSeries {

        public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int term = sc.nextInt();
            FibonacciSeries  fibonacciSeries = new FibonacciSeries();
            fibonacciSeries.findFiboSeries(term);


        }
        void findFiboSeries(int term) {
        int a=0,b=1;
        System.out.print(a+" "+b);
        int c;

        for(int i=1; i<=term; i++) {
            c=a+b;
            System.out.print(" "+c);
            // swapping
            a=b;
            b=c;
        }
    }
}

