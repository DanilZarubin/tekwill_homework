package edu.tekwill.homework.exercise3003;

import java.util.Scanner;

public class SmartHome {

    public static void main(String[] args) { //Exercise 2
        System.out.println("input a command");
        String code = new Scanner(System.in).nextLine().toLowerCase();

        switch (code) {
            case "aon": System.out.println("Aquarium light is turned on"); break;
            case "aoff": System.out.println("Aquarium light is turned off"); break;
            case "bon": System.out.println("Bathroom heating is turned on"); break;
            case "boff": System.out.println("Bathroom heating is turned off"); break;
            case "kon": System.out.println("Kitchen heating is turned on"); break;
            case "koff": System.out.println("Kitchen heating is turned off"); break;
            case "con": System.out.println("Cooling is turned on"); break;
            case "coff": System.out.println("Cooling is turned off"); break;
            case "ron": System.out.println("Living room light is turned on"); break;
            case "roff": System.out.println("Living room light is turned off"); break;
            default: System.out.println("unsupported command code");
        }
    }
}
