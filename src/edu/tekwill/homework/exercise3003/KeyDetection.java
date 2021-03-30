package edu.tekwill.homework.exercise3003;

import java.util.Locale;
import java.util.Scanner;

public class KeyDetection {

    public static void main(String[] args) { //Exercise 1
        System.out.println("press a key \nonly the upper keyboard row is supported");
        String key = new Scanner(System.in).nextLine().toLowerCase();

        switch (key){
            case "q" : System.out.println("You pressed 'q' character"); break;
            case "w" : System.out.println("You pressed 'w' character"); break;
            case "e" : System.out.println("You pressed 'e' character"); break;
            case "r" : System.out.println("You pressed 'r' character"); break;
            case "t" : System.out.println("You pressed 't' character"); break;
            case "y" : System.out.println("You pressed 'y' character"); break;
            case "u" : System.out.println("You pressed 'u' character"); break;
            case "i" : System.out.println("You pressed 'i' character"); break;
            case "o" : System.out.println("You pressed 'o' character"); break;
            case "p" : System.out.println("You pressed 'p' character"); break;
            default : System.out.println("unsupported input");
        }
    }
}
