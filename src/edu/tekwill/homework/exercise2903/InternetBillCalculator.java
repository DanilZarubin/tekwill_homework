package edu.tekwill.homework.exercise2903;

import java.util.Scanner;

public class InternetBillCalculator {

    public static void main(String[] args) { //Exercise 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your package and press Enter \n Shall be A, B, C");
        String pack = sc.nextLine();
        System.out.println("Enter the amount of hours used");
        float hours = sc.nextFloat();
        float toPay = 0;

        if (hours > 0) {
            if (pack.equalsIgnoreCase("a")) {
                toPay = hours <= 10 ? 9.95F : (hours - 10) * 2;
            } else if (pack.equalsIgnoreCase("b")) {
                toPay = hours <= 10 ? 13.95F : (hours - 20);
            } else if (pack.equalsIgnoreCase("c")) {
                toPay = 19.95F;
            }
        }
        if (toPay > 0) {
            System.out.println("Total charges for package you chose " + pack + " is: " + toPay);
        } else {
            System.out.println("You must provide a positive number of hours or a valid internet package");
        }
    }


}

