package chapter3;

import java.util.Scanner;

//nested if-else statements
public class LoanQualifier {

    public static void main(String[] args){
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your annual salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with you're current employer");
        double years = scanner.nextDouble();
        scanner.close();
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed)
                System.out.println("Congrats! You qualify for a Loan");
            else{
                System.out.println("Sorry, you must have worked at your current job for at least "
                        + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry. You must earn at least " + requiredSalary + "to qualify for the loan.");
        }
    }
}
