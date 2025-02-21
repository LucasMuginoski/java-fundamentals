package chapter3;

import java.util.Scanner;

public class ChangeDollarGame {

    public static void main(String[] args){
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar' Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies: ");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels: ");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes: ");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters: ");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double totalAmount = numOfPennies*penny + numOfNickels*nickel + numOfDimes*dime + numOfQuarters*quarter;

        if(totalAmount < dollar){
            double dollarShort = totalAmount - dollar;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", dollarShort) + " cents.");
        } else if (totalAmount > dollar) {
            double dollarOver = totalAmount - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", dollarOver) + " cents.");
        }
        else {
            System.out.println("Congrats! That's exactly $1.00! You win!");
        }
    }
}
