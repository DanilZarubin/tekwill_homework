package edu.tekwill.homework.homework0404;

public class SumASquareRoot { //Exercise 4
    public static void main(String[] args) {
        int nth = 625;
        double sum = 1 / (1 + Math.sqrt(2));
        for (int i = 2; i < nth - 1; i++) {
            double r = (1 / (Math.sqrt(i) + Math.sqrt(i + 1)));
            sum += r;
        }
        System.out.print("\nsum = " + sum);
    }
}

