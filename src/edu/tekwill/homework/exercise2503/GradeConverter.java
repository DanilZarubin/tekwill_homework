package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class GradeConverter { //Exercise 5

    public static void main(String[] args) {
        System.out.println("Enter a letter grade and press Enter");
        System.out.println(gradeConverter(new Scanner(System.in).nextLine()));
    }

    public static String gradeConverter(String grade) {
        String message;

        if (grade.equals("A")) {
            message = "The numeric value for grade " + grade + " is " + "4";
        } else if (grade.equals("B")) {
            message = "The numeric value for grade " + grade + " is " + "3";
        } else if (grade.equals("C")) {
            message = "The numeric value for grade " + grade + " is " + "2";
        } else if (grade.equals("D")) {
            message = "The numeric value for grade " + grade + " is " + "1";
        } else if (grade.equals("F")) {
            message = "The numeric value for grade " + grade + " is " + "0";
        } else {
            message = grade + "is an invalid grade";
        }
        return message;
    }
}

