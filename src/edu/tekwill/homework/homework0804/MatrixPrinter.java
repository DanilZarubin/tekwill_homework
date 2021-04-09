package edu.tekwill.homework.homework0804;

public class MatrixPrinter { //Exercise 5
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("The matrix is");

        for (int[] innArr : arr) {
            System.out.println();
            for (int col : innArr) {
                System.out.print(col + " ");
            }
        }
    }
}
