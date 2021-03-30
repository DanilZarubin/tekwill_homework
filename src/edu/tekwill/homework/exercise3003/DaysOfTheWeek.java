package edu.tekwill.homework.exercise3003;

import java.util.Scanner;

public class DaysOfTheWeek { //Exercise 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day [1-7]");
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            case 3: System.out.println("wednesday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday"); break;
            case 7: System.out.println("sunday"); break;
            default: System.out.println("something is wrong");
        }
    }
}
