package edu.tekwill.homework.exercise2903;

import java.util.Scanner;

public class FatCalorieCounter { //Exercise 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the food item calorie amount");
        float calorieAmount = sc.nextFloat();

        System.out.println("Enter the quantity of fat in grams");
        float fatWeight = sc.nextFloat();

        if (calorieAmount > 0 && fatWeight > 0) {
            calorieCalc(calorieAmount, fatWeight);
        } else {
            System.out.println("Wrong input: Both values shall be bigger than zero");
        }

    }

    private static void calorieCalc(float calorieAmount, float fatWeight) {
        float caloriesFromFat = (fatWeight * 9.00F) / calorieAmount * 100;

        if (caloriesFromFat > 100) {
            System.out.println("Wrong numbers: \n the food item of such calorie value shall not contain more than " + calorieAmount / 9 + " grams of fat");
        } else {
            System.out.println("The amount of calories from fat is " + caloriesFromFat + "% of total calories value");
        }
        if (caloriesFromFat < 30.0) {
            System.out.println("This food is low in fat");
        }
    }
}
