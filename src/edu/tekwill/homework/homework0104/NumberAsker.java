package edu.tekwill.homework.homework0104;

import java.util.Scanner;

public class NumberAsker { //Exercise 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;

        for(int i = 1; i != 0; i++){
            System.out.println("enter a number");
            float input = sc.nextFloat();
            sum += input;
            System.out.println(sum);

            if(input == 0){
                System.out.println("well... by!");
                System.exit(0);
            }
        }
    }
}
