package edu.tekwill.homework.exercise3003;

import java.util.Scanner;

public class NumberOfDaysInAMonth { //Exercise 4
        public static void main(String[] args) {
            System.out.println("Please enter the month [1-12]");
            int month = new Scanner(System.in).nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12 : System.out.println("total number of days is 31"); break;
                case 2 :  System.out.println("total number of days is 28 1/4"); break;
                case 4 :
                case 6 :
                case 9 :
                case 11 : System.out.println("total number of days is 30"); break;
                default: System.out.println("something is wrong");
            }
    }
}
