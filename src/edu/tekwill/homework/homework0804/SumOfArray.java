package edu.tekwill.homework.homework0804;

public class SumOfArray { //Exercise 1
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,8};
        System.out.println(sumOf(arr));
    }

    public static int sumOf(int[] arr) {
        int sum = 0;

        for(int element : arr) {
            sum += element;
        }

        return sum;
    }
}
