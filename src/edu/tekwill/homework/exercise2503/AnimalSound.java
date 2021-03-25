package edu.tekwill.homework.exercise2503;

import java.util.Scanner;

public class AnimalSound {

    public static void main(String[] args) { //Exercise 4

        System.out.println("Print the animal name and press Enter");
        System.out.println(animalVoice(new Scanner(System.in).nextLine()));
    }

    public static String animalVoice(String animal){
        String voice = " ";
        if (animal.equals("Wolf")){
            voice = "Howl";
        }else if(animal.equals("Cat")){
            voice = "Meow";
        }else if(animal.equals("Dog")){
            voice = "Hoof";
        }else if(animal.equals("Cow")){
            voice = "Mooo";
        }else if(animal.equals("Sheep")){
            voice = "Baaa";
        }else if(animal.equals("Snake")){
            voice = "Hiss";
        }
        return voice;
    }

}
