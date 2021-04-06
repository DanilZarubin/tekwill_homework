package edu.tekwill.homework.homework0404;

import java.util.Scanner;

public class BarPrinter { //Exercise 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers between 1 and 30 separated by space");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        printer(n1);
        printer(n2);
        printer(n3);
        printer(n4);
        printer(n5);
    }

    static void printer(int count){
        if(count > 30){
            count = 30;
        } else if(count < 1){
            count = 1;
        }
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

