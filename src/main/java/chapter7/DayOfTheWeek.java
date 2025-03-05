package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args){
        String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week: ");
        int day = scanner.nextInt();
        System.out.println(daysWeek[(day - 1)]);
        scanner.close();
    }
}
