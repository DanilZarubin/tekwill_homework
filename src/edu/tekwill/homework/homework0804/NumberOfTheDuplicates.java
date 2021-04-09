package edu.tekwill.homework.homework0804;

public class NumberOfTheDuplicates { //Exercise 2
    public static void main(String[] args) {
        int[] arr = new int[] {5,1,1,2,2,3,4,7};

        System.out.println(findADup(arr));
    }

    public static int findADup(int[] arr) {
        int numOfDup = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    numOfDup++;
                }
            }
        }
        return numOfDup;
    }
}
