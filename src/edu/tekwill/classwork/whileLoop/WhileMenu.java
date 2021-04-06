package edu.tekwill.classwork.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class WhileMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exitSelected = false;
        do {
            displayMenu();
            String selectedOption = sc.nextLine();
            if (selectedOption.equalsIgnoreCase("exit")) {
                exitSelected = true;
            } else {
                executeOption(selectedOption);
            }
        } while (!exitSelected);
    }

    private static void executeOption(String selectedOption) {
        Random random = new Random();
        switch (selectedOption.toLowerCase()) {
            case "hey": {
                System.out.println("Hello, amigo!");
                break;
            }
            case "fact": {
                System.out.println("Java is the best");
                break;
            }
            case "random": {
                System.out.println(random.nextInt(25));
                break;
            }
            case "weather": {
                System.out.println(random.nextBoolean() ? "It will rain" : "Gonna be sunny");
                break;
            }
            default: {
                System.out.println("Unknown option!");
            }
        }
    }

    static void displayMenu() {
        System.out.println("\tMenu");
        System.out.println("[hey] - greetings");
        System.out.println("{[fact] - interesting fact");
        System.out.println("[random] - random number");
        System.out.println("[weather] - guess weather");
        System.out.println("[exit]");
    }
}
