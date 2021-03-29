package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class AnimalSound {

    public static void main(String[] args) { //Exercise 4

        System.out.println("Print the animal name and press Enter");
        System.out.println(animalVoice(new Scanner(System.in).nextLine()));
    }

    public static String animalVoice(String animal){
        String voice = " ";
        if (animal.equalsIgnoreCase("Wolf")){
            voice = "Howl";
        }else if(animal.equalsIgnoreCase("Cat")){
            voice = "Meow";
        }else if(animal.equalsIgnoreCase("Dog")){
            voice = "Hoof";
        }else if(animal.equalsIgnoreCase("Cow")){
            voice = "Mooo";
        }else if(animal.equalsIgnoreCase("Sheep")){
            voice = "Baaa";
        }else if(animal.equalsIgnoreCase("Snake")){
            voice = "Hiss";
        }else{
            System.out.println("No such animal in the database");
        }
        return voice;
    }

}
