package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours the employee worked.");
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate.");
        double payRate = scanner.nextDouble();

        double grossPay = payRate * hours;
        System.out.print("The employee's gross pay is $" + grossPay);

    }
}
