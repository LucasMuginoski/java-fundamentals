package chapter3;

import java.util.Scanner;

// if-else-if statements
public class TestResults {

    public static void main(String[] args){
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        char grade;
        if(score < 60){
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is: " + grade);
        //Personally, the switch statement makes more sense in this type of logic.
    }
}
