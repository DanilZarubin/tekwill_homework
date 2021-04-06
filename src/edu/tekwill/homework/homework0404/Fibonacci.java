package edu.tekwill.homework.homework0404;

import java.util.Scanner;

public class Fibonacci { //Exercise 5
    public static void main(String[] args) {
        System.out.println("input number of terms");
        int num = new Scanner(System.in).nextInt();

        int f0 = 0, f1 = 1;

        System.out.println("Fibonacci series:");
        System.out.print(f0 + ", " + f1);
        for (int i = 2; i < num; i++) {
            int f2 = f0 + f1;
            System.out.print(", " + f2);
            f0 = f1;
            f1 = f2;
        }

    }


}

