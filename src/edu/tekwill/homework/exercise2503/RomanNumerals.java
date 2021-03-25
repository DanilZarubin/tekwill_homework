package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class RomanNumerals { //Exercise 7

    public static void main(String[] args) {

        System.out.println("Enter the number within the range 1 through 10 and press Enter");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 1 && num <=10){
            romanNum(num);
        }else{
            System.out.println("It's a an invalid number");
        }
}

    public static void romanNum(int dayNumber){
        switch (dayNumber){
            case 1 :
                System.out.println("Roman number: I"); break;
            case 2 : System.out.println("Roman number: II"); break;
            case 3 : System.out.println("Roman number: III"); break;
            case 4 : System.out.println("Roman number: IV"); break;
            case 5 : System.out.println("Roman number: V"); break;
            case 6 : System.out.println("Roman number: VI"); break;
            case 7 : System.out.println("Roman number: VII"); break;
            case 8 : System.out.println("Roman number: VIII"); break;
            case 9 : System.out.println("Roman number: IX"); break;
            case 10 :System.out.println("Roman number: X"); break;
        }
    }

    }
