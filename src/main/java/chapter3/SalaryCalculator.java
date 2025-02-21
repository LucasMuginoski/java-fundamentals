package chapter3;

import java.util.Scanner;

//if statements
public class SalaryCalculator {

    public static void main(String[] arg){
        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int goal = 10;

        //get unknown values
        System.out.println("How many sales did the employee make in this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour the bonus earners
        if(sales > goal){
            salary = salary + bonus;
        }
        //output
        System.out.println("The employee's pay is $" + salary);
    }
}
