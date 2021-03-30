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

    /*
    Write a Java program which will enable or disable a device in your house based on the code entered by user.
Test data
Input code: 0
Expected output:
You've enabled the lights in the bathroom
Another example -
Input key: 1
Expected output:
You've disabled the lights in the bathroom
The devices and printed statements are completely up to you. You decide what does each code does. Limit yourself to 10 cases, so it means 5 devices with 2 options: enable/disabled, and each action assigned to a code, which is also up to your choosing.
     */
}
