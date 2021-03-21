package edu.tekwill.homework.exercise2103;

public class LogicalExpressions { //Exercise 5

    public static void main(String[] args) {

        int a = 18;
        int b = 22;
        int c = 30;
                            //19      //22
        System.out.println(++a > 18 || b++ < 10); //true
                           //22       //19
        System.out.println(b-- > 30 && a++ <= 19); //false
                           //30 19   19   21   31
        System.out.println(c++ > a && a < b || c++ < 30); //true

        System.out.println("a = " + a); //19
        System.out.println("b = " + b); //21
        System.out.println("c = " + c); //31

    }
}
