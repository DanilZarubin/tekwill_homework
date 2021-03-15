

public class NameHandler {

    public static void main(String[] args) {

        greetings(args[0], args[1]);
        reverse(args [0],args[1]);
        palindromeCheck(args[0], args[1]);

        System.out.println("Sorry " + args[0] + " " + args [1] + ", I run out of ideas ");
    }

    public static void greetings(String name, String lastName){
        System.out.println("Hello, " + name + " " + lastName + "! How are you?");
    }

    public static void reverse(String name, String lastName){
        System.out.println("This is your name written backwards " + new StringBuilder(name.concat(lastName).toLowerCase()).reverse());
    }

    public static void palindromeCheck(String name, String lastName) {

        String temp = name.concat(lastName).toLowerCase();

        if(temp.equals(new StringBuilder(temp).reverse().toString())){
            System.out.println("Oh, shit! Your name is a palindrome!");}
            else {
                System.out.println("Aw, just a name... Not a palindrome");
            }
        }
    }


