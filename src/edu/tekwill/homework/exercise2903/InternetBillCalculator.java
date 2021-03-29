package edu.tekwill.homework.exercise2903;

import java.util.Scanner;

public class InternetBillCalculator {

    public static void main(String[] args) { //Exercise 3

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter your package and press Enter \n Shall be A, B, C");
            String pack = sc.nextLine();

            if(pack.equalsIgnoreCase("a")){
                System.out.println("Enter the amount of hours used");
                float hours = sc.nextFloat();
                if(hours < 0){
                    System.out.println("Amount of hours must be more or equal to 0");
                } else{
                    System.out.println("The total charges are "+ billCalc(hours, 2.00F, 10.0F) + "$");
                }
            } else if(pack.equalsIgnoreCase("b")){
                System.out.println("Enter the amount of hours used");
                float hours = sc.nextFloat();
                if(hours < 0){
                    System.out.println("Amount of hours must be more or equal to 0");
                } else{
                    System.out.println("The total charges are "+ billCalc(hours, 2.00F, 10.0F) + "$");
                }
            } else if (pack.equalsIgnoreCase("c")){
                System.out.println("You've got an unlimited package");
            } else{
                System.out.println("Please be reminded that package shall be A, B, or C");
            }
            sc.close();
        }

    private static float billCalc(float hours, float pricePerHour, float hoursInc){
       return (hours - hoursInc) * pricePerHour;
    }
}
