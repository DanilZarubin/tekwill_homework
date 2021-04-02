package edu.tekwill.homework.homework0104;

import java.util.Scanner;

public class TravelCalculator { //Exercise 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the speed");
        int speed = sc.nextInt();
        System.out.println("enter the numbers of hours");
        int hours = sc.nextInt();

        System.out.println("hours   distance traveled");

        for(int i = 1; i <= hours; i++){
            int distance = speed * i;
            System.out.println(i + "           " + distance);
        }
    }
}
