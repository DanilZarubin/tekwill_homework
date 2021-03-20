package edu.tekwill.homework.exercise2103;

import java.util.Scanner;

public class SpeedCalculator { //Exercise 2
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);//capture data
            System.out.println("Please enter the distance in meters and press Enter");
            int distance = scan.nextInt();
            System.out.println("Please enter the time: hours, minutes and seconds, separated by spaces; then press Enter");

        loop: while(true) {
            double hours = scan.nextInt();
            double minutes = scan.nextInt();
            double seconds = scan.nextInt();

            if(minutes > 60 || seconds > 60){ //must check
                System.out.println("Please enter VALID values: hours, minutes and seconds, separated by spaces; then press Enter");
                continue loop;
            }

            double timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;

            float speedMetersPerSecond = (float) (distance / timeInSeconds);
            System.out.println("Speed in m/sec  " + speedMetersPerSecond);

            float speedKmPerHour = (float) (speedMetersPerSecond * 3.6);
            System.out.println("Speed in km/hour  " + speedKmPerHour);

            float speedMilesPerHour = (float) (speedKmPerHour / 1.609);
            System.out.println("Speed in miles/hour  " + speedMilesPerHour);

            //Dependant formulas - not the best practice overall but it seems to be fine right
            //due to simplicity of the task
            scan.close();
            break;
        }
    }
}




