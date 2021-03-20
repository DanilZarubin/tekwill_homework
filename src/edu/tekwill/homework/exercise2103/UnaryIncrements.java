package edu.tekwill.homework.exercise2103;

public class UnaryIncrements { //Exercise 4

    public static void main(String[] args) {
        int a = 7;
        //8   //7   //7   //9   //9    //7 //7    //9
        int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
        //8-7+7+9-9-7-7+9=3
        System.out.println(result);
    }
}
