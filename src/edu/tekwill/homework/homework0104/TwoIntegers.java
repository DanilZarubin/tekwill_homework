package edu.tekwill.homework.homework0104;

import java.util.Scanner;

public class TwoIntegers { //Exercise 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first int");
        int firstNum = sc.nextInt();
        System.out.println("enter the second int");
        int secondNum = sc.nextInt();
        int sum = 0;

        for(int i = firstNum; i <= secondNum; i++){
            sum += i;
        }
        System.out.println("sum of all the integers between " + firstNum + " and "+ secondNum + " is " + sum);
    }
}
