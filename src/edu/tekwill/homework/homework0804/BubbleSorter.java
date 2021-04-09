package edu.tekwill.homework.homework0804;

public class BubbleSorter { //Exercise 4
    public static void main(String[] args) {
        int[] arr = new int[] {2,7,4,5,9};

        sorter(arr);
    }

    public static void sorter(int[] arr) {
        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i +1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr [j] = temp;
                }
            }
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
