package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class GreatestNumber { //Exercise 2

    public static void main(String[] args) {

        double input;
        double greatestNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        input = sc.nextDouble();
        if(input > greatestNum){
            greatestNum = input;
        }
        System.out.println("Enter the second number");
        input = sc.nextDouble();
        if(input > greatestNum){
            greatestNum = input;
        }
        System.out.println("Enter the third number");
        input = sc.nextDouble();

        if(input > greatestNum){
            greatestNum = input;
        }

        sc.close();
        System.out.println(greatestNum);
    }
}
