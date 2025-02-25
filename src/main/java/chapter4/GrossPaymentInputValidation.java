package chapter4;

import java.util.Scanner;

// WHILE loop:
public class GrossPaymentInputValidation {
    public static void main(String[] args){

        int rate = 15;
        int maxHours = 40; //40 hours per week.

        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while (hoursWorked > maxHours){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again");
            hoursWorked = scanner.nextDouble();
            //while the condition is true, the loop will run. Be careful if this is always true and creates an infinite loop.
        }
        scanner.close();
        double grossPayment = rate * hoursWorked;
        System.out.println("Gross pay: $"+ grossPayment);
    }
}
