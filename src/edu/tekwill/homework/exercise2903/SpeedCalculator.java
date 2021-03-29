package edu.tekwill.homework.exercise2903;

import java.util.Scanner;

public class SpeedCalculator {//Exercise 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your environment and press Enter \n Shall be air, water, or steel");
        String env = sc.nextLine();

        if (env.equalsIgnoreCase("air")) {
            System.out.println("Enter the distance in feet");
            float distance = sc.nextFloat();
            if (distance < 0) {
                System.out.println("Distance shall be more or equal to 0");
            } else {
                System.out.println("The time to travel is " + distance/1100  + "seconds");
            }
        }else if (env.equalsIgnoreCase("water")) {
            System.out.println("Enter the distance in feet");
            float distance = sc.nextFloat();
            if (distance < 0) {
            System.out.println("Distance shall be more or equal to 0");
            } else {
            System.out.println("The time to travel is " + distance/4900 + "seconds");
        }
        }
        else if (env.equalsIgnoreCase("steel")) {
            System.out.println("Enter the distance in feet");
            float distance = sc.nextFloat();
            if (distance < 0) {
                System.out.println("Distance shall be more or equal to 0");
            } else {
                System.out.println("The time to travel is " + distance/16400 + "seconds");
            }
        } else {
            System.out.println("Please be reminded that package shall be A, B, or C");
        }
        sc.close();


    }

    private static float timeCalc(float speed, float distance) {
        return distance / speed;
    }
}
