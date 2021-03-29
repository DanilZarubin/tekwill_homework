package edu.tekwill.homework.exercise2503;

import java.util.Locale;
import java.util.Scanner;

public class LetterToButtonMapper { //Exercise 6
    public static void main(String[] args) {
        System.out.println("Enter a letter");
        System.out.println(buttonSelector(new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT)));
    }

    public static String buttonSelector(String input){
        String message;

        if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b") || input.equalsIgnoreCase("c")) {
            message = "The corresponding number is 2";
        } else if (input.equalsIgnoreCase("d") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("f")) {
            message = "The corresponding number is 3";
        } else if (input.equalsIgnoreCase("g") || input.equalsIgnoreCase("h") || input.equalsIgnoreCase("i")) {
            message = "The corresponding number is 4";
        } else if (input.equalsIgnoreCase("j") || input.equalsIgnoreCase("k") || input.equalsIgnoreCase("l")) {
            message = "The corresponding number is 5";
        } else if (input.equalsIgnoreCase("m") || input.equalsIgnoreCase("n") || input.equalsIgnoreCase("o")) {
            message = "The corresponding number is 6";
        }else if (input.equalsIgnoreCase("p") || input.equalsIgnoreCase("q") || input.equalsIgnoreCase("r") || input.equalsIgnoreCase("s")) {
            message = "The corresponding number is 7";
        }else if (input.equalsIgnoreCase("t") || input.equalsIgnoreCase("u") || input.equalsIgnoreCase("v")) {
            message = "The corresponding number is 8";
        }else if (input.equalsIgnoreCase("w") || input.equalsIgnoreCase("x") || input.equalsIgnoreCase("y") || input.equalsIgnoreCase("z")) {
            message = "The corresponding number is 8";
        } else {
            message = "This is an invalid input";
        }
        return message;
    }


}
