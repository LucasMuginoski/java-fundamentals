package chapter3;

import java.util.Scanner;

//using logical operators.
public class LogicOperatorLoanQualifier {

    public static void main(String[] args){
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your annual salary?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with you're current employer");
        double years = scanner.nextDouble();
        scanner.close();
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
            System.out.println("Congrats! You qualify for a Loan");
        }
        else{
            System.out.println("Sorry. You do not qualify for the loan.");
        }
    }
}
