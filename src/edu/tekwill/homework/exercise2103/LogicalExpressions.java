package edu.tekwill.homework.exercise2103;

public class LogicalExpressions { //Exercise 5

    public static void main(String[] args) {

        int a = 18;
        int b = 22;
        int c = 30;
        System.out.println(++a > 18 || b++ < 10);
        System.out.println(b-- > 30 && a++ <= 19);
        System.out.println(c++ > a && a < b || c++ < 30);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }

    /*
    What's the output of this program?

Which expressions will execute and which will not?
Aici la fel, încercați singuri să ajungeți la rezultat, și să scrieți în comentarii alături de fiecare System.out.println care expresie este evaluată sau nu, și de ce

     */
}
