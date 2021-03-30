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
        float result;

        switch (operator){
            case "+" :
                result = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + result);
                break;
            case "-" :
                result = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + result);
                break;
            case "*" :
                result = firstNum * secondNum;
                System.out.println(firstNum + " * " + secondNum + " = " + result);
                break;
            case "/" :
                result = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " + result);
                break;
            default :
                System.out.println("you've entered either a wrong operator, either an invalid value");
        }
    }
}
