package edu.tekwill.homework.homework0404;

import java.util.Scanner;

public class NumberOfTerms { //Exercise 7
    public static void main(String[] args) {
        System.out.println("enter the number of terms");
        int numOfTerms = new Scanner(System.in).nextInt();
        int total = 2;
        int temp = 2;

        for (int i = 1; i < numOfTerms; i++) {
            temp = temp * 10 + 2;
            total += temp;
        }
        System.out.println(total);
    }
}


