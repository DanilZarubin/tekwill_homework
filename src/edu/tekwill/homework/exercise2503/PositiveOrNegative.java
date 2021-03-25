package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class PositiveOrNegative { //Exercise 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number and press Enter");
        double num = sc.nextDouble();
        sc.close();

        String outputMessage =  (num > 0) ? "Number is positive" : "Number is negative";

        System.out.println(outputMessage);
    }
}
