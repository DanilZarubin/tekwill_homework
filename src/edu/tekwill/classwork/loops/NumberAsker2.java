package edu.tekwill.classwork.loops;

import java.util.Scanner;

public class NumberAsker2 { //Exercise 3

    static float sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //float sum = 0;
        System.out.println("enter a number");

        for(int userNum  = sc.nextInt(); userNum != 0; userNum = sc.nextInt()){
            System.out.println("enter a number");
            sum += userNum;
            System.out.println(sum);
            }
        }
    }

