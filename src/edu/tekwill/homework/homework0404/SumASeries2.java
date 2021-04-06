package edu.tekwill.homework.homework0404;

public class SumASeries2 {
    public static void main(String[] args) {
        int nth = 99;
        double sum = 0;
        for (int i = 1; i <= nth -2; i+=2) {
            sum += (double) i / (i + 2);
                System.out.print(i + "/" + (i+2) + " ");
        }
        System.out.print("\nsum = " + sum);
    }
}
