package edu.tekwill.homework.exercise2103;

import java.util.Scanner;

public class IntegerToDigits { //Exercise 3

    public static void main(String[] args) {

        sequenceCutter(sequenceGrabber());

    }

    public static Integer sequenceGrabber(){

        int sequence = 0;
        Scanner sc = new Scanner(System.in);

            System.out.println("Please enter six non-negative digits and press Enter");
            int temp = sc.nextInt();

            if (temp > 0 ) {
                sequence = temp;
            } else {
                System.out.println("Value SHALL be six non-negative digits");
            }
            sc.close();
        return sequence;
    }

    public static void sequenceCutter(int sequence){

        int digit1=sequence/100000%10;
        int digit2=sequence/10000%10;
        int digit3=sequence/1000%10;
        int digit4=sequence/100%10;
        int digit5=sequence/10%10;
        int digit6=sequence%10;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 + " " + digit6);
    }
}
