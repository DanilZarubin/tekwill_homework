package edu.tekwill.homework.exercise2903;

import java.util.Scanner;

public class SpeedCalculator {//Exercise 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your environment and press Enter \n Shall be air, water, or steel");
        String env = sc.nextLine();

        if (env.equalsIgnoreCase("air")) {
            airCalc();
        } else if (env.equalsIgnoreCase("water")) {
            waterCalc();
        } else if (env.equalsIgnoreCase("steel")) {
            steelCalc();
        } else {
            System.out.println("Please be reminded that environment shall be air, water, or steel");
        }
        sc.close();
    }

    public static void airCalc() {
        System.out.println("Enter the distance in feet");
        float distance = new Scanner(System.in).nextFloat();
        if (distance < 0) {
            System.out.println("Distance shall be more or equal to 0");
        } else {
            System.out.println("The time to travel is " + distance / 1100 + "seconds");
        }
    }

    public static void waterCalc() {

        System.out.println("Enter the distance in feet");
        float distance = new Scanner(System.in).nextFloat();
        if (distance < 0) {
            System.out.println("Distance shall be more or equal to 0");
        } else {
            System.out.println("The time to travel is " + distance / 4900 + "seconds");
        }
    }

    public static void steelCalc() {
        System.out.println("Enter the distance in feet");
        float distance = new Scanner(System.in).nextFloat();
        if (distance < 0) {
            System.out.println("Distance shall be more or equal to 0");
        } else {
            System.out.println("The time to travel is " + distance / 16400 + "seconds");
        }
    }
}