package edu.tekwill.classwork.whileLoop;

public class WhileExample {
    public static void main(String[] args) {
        //both do the same thing
        int i = 0;
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("for" + i);

        i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        System.out.println( "while "+ i);

        while(true){
            System.out.println(i);
            if(i == 10){
                break;
            }
            i++;
        }
        System.out.println("while(true)" + i);
    }
}
