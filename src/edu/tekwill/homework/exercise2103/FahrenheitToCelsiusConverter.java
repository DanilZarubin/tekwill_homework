package edu.tekwill.homework.exercise2103;

import java.util.Formatter;
import java.util.Scanner;

public class FahrenheitToCelsiusConverter {         //Exercise 1
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value in Fahrenheit and press Enter");
        float value = sc.nextInt();
        sc.close();
        
        float result = (value - 32) * 0.5556F;

        //Formatter instance is used to trim output down to decimals
        System.out.println(value + " Fahrenheit is equal to "+" "+ (new Formatter().format("%.2f", result)) + " Centigrade");
  }   
}
