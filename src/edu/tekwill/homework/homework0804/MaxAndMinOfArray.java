package edu.tekwill.homework.homework0804;

public class MaxAndMinOfArray { //Exercise 3
    public static void main(String[] args) {
        int[] arr = new int[]{45, 25, 21};

        maxAndMin(arr);
    }

    public static void maxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }

            System.out.print(element + " ");
        }

        System.out.println("\nmin is " + min);
        System.out.println("max is " + max);
    }
}
