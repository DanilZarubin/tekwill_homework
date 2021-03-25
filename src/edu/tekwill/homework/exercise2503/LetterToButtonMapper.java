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

        if (input.equals("a") || input.equals("b") || input.equals("c")) {
            message = "The corresponding number is 2";
        } else if (input.equals("d") || input.equals("e") || input.equals("f")) {
            message = "The corresponding number is 3";
        } else if (input.equals("g") || input.equals("h") || input.equals("i")) {
            message = "The corresponding number is 4";
        } else if (input.equals("j") || input.equals("k") || input.equals("l")) {
            message = "The corresponding number is 5";
        } else if (input.equals("m") || input.equals("n") || input.equals("o")) {
            message = "The corresponding number is 6";
        }else if (input.equals("p") || input.equals("q") || input.equals("r") || input.equals("s")) {
            message = "The corresponding number is 7";
        }else if (input.equals("t") || input.equals("u") || input.equals("v")) {
            message = "The corresponding number is 8";
        }else if (input.equals("w") || input.equals("x") || input.equals("y") || input.equals("z")) {
            message = "The corresponding number is 8";
        } else {
            message = "This is an invalid input";
        }
        return message;
    }


}
