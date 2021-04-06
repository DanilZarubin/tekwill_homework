package edu.tekwill.homework.homework0404;

import java.util.Scanner;

public class Factorial { //Exercise 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial num");
        int num = sc.nextInt();

        for(int i = num -1; i > 0; i--){
            num *= i;
        }
        System.out.println(num);
    }
}
