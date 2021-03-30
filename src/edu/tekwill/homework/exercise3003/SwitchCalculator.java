package edu.tekwill.homework.exercise3003;

import java.util.Scanner;

public class SwitchCalculator { //Exercise 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the operator +,-,*, or /");
        String operator = scanner.nextLine();
        System.out.println("enter the first number");
        final float firstNum = scanner.nextFloat();
        System.out.println("enter the second number");
        final float secondNum = scanner.nextFloat();

        float sum = firstNum + secondNum;
        float sub = firstNum - secondNum;
        float mult = firstNum * secondNum;
        float div = firstNum / secondNum;


        switch (operator){
            case "+" : System.out.println(firstNum + " + " + secondNum + " = " + sum); break;
            case "-" : System.out.println(firstNum + " - " + secondNum + " = " + sub); break;
            case "*" : System.out.println(firstNum + " * " + secondNum + " = " + mult); break;
            case "/" : System.out.println(firstNum + " / " + secondNum + " = " + div); break;
            default : System.out.println("you've entered either a wrong operator, either an invalid value");
        }
    }
}
