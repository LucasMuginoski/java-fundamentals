package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();

        greetUser(name);
    }

    //AccessModifier non-accessModifier type methodName
    public static void greetUser(String nome){
        System.out.println("Hi there, " + nome + "!");
    }
}
