package edu.tekwill.homework.homework0104;

public class ProductOfIntegers { //Exercise 1
    public static void main(String[] args) {
        int integ = 1;
        for(int i = 1; i <= 15; i++){
            if(i%2 == 1){integ = integ * i;}
        }
        System.out.println(integ);
    }
}
