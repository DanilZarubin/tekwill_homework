package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class DayOfTheWeek { //Exercise 3

    public static void main(String[] args) {

        System.out.println("Enter the day number and press Enter");
        System.out.println(dayOfTheWeek(new Scanner(System.in).nextInt()));
    }

    public static String dayOfTheWeek(int dayNumber){
        String day = " ";
        switch (dayNumber){
            case 1 : day = "Monday"; break;
            case 2 : day = "Tuesday"; break;
            case 3 : day = "Wednesday"; break;
            case 4 : day = "Thursday"; break;
            case 5 : day = "Friday"; break;
            case 6 : day = "Saturday"; break;
            case 7 : day = "Sunday"; break;
        }
        return day;
    }
}
