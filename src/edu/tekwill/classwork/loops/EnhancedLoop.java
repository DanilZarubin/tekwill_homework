package edu.tekwill.classwork.loops;

import java.util.ArrayList;
import java.util.Iterator;

public class EnhancedLoop { //for each
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("berries");
        fruits.add("mango");

        //the trued classic
        for(int i = 0; i < fruits.size(); ++i){
         System.out.println("fruit Num " + i + " is " + fruits.get(i));
        }

        //modern shit
        for(Iterator<String> iterator = fruits.iterator(); iterator.hasNext(); ){
            String object = iterator.next();
            System.out.println("next is  " + object);
        }

        //warrior's weapon
        for(String object : fruits){
            System.out.println("netxt is " + object);
        }
    }
}
