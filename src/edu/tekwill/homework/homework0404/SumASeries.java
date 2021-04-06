package edu.tekwill.homework.homework0404;

public class SumASeries { //Exercise 3
    public static void main (String[] args) {
        int nth = 99;
        double sum = 0;
        for (int i = 0; i < nth; i++) {
            int r = (1 + (i * 2));
            int n = (3 + (i * 2));
            if (n <= nth) {
                sum += (double) (r) / (n);
                System.out.print(r + "/" + n + " ");
            }
        }
        System.out.print("\nsum = " + sum);
    }
}
