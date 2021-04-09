package edu.tekwill.homework.homework0804;

public class PatternPrinter { //Exercise 6
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] arr1 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        patternOne(arr);
        patternTwo(arr1);
        patternThree(arr2);
    }

    private static void patternOne(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = 1;
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();
    }

    private static void patternTwo(int[][] arr) {
        int temp = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            temp--;
            for (int j = 0; j < arr[i].length; j++) {
                if(j == temp) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();
    }

    private static void patternThree(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                if(i > 0 && i < arr.length -1 && j > 0 && j < arr[i].length -1) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();
    }
}
