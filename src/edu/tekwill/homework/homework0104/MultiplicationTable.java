package edu.tekwill.homework.homework0104;

import java.util.Scanner;

public class MultiplicationTable { //Exercise 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the range");
        int range = sc.nextInt();

        for(int i = 1; i <= range; i++){
            int result = num * i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
