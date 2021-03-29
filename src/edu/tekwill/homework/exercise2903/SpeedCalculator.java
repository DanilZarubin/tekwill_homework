package edu.tekwill.homework.exercise2903;

import java.util.Scanner;

public class SpeedCalculator {//Exercise 2

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your environment and press Enter \n Shall be air, water, or steel");
        String env = sc.nextLine();
        System.out.println("Enter the distance in feet");
        float distance = sc.nextFloat();
        float time = 0;


        if (env.equalsIgnoreCase("air")) {
            time = distance / 1100;
        } else if (env.equalsIgnoreCase("water")) {
            time = distance / 4900;
        } else if (env.equalsIgnoreCase("steel")) {
            time = distance / 16400;
        } else {
            System.out.println("The time to travel is " + distance / 16400 + "seconds");
        }

        if (time > 0) {
            System.out.println("The time sound needs to travel in " + env + " is: " + time);
        } else {
            System.out.println("You either entered a unknown medium, either a negative or zero distance.");
        }
    }
}