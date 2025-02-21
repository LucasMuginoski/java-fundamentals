package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one season or the year");
        String season = scanner.next();

        System.out.println("Enter a adjective");
        String adjective = scanner.next();

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
