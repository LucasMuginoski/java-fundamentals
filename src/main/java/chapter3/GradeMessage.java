package chapter3;

import java.util.Scanner;

//Switch Statements
public class GradeMessage {

    public static void main(String[] args){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        String message;

        switch (grade){
            case "A":
                message= "Excellent job!";
                break;
            case "B":
                message= "Great job!";
                break;
            case "C":
                message= "Good job!";
                break;
            case "D":
                message= "You need to work a bit harder.";
                break;
            case "E":
                message= "You need to work a bit harder too.";
                break;
            case "F":
                message= "Uh oh!";
                break;
            default:
                message= "Error, invalid grade.";
        }

        /*
        Suggestion made by IDE. Looks nice and I am taking this note as well.
        * String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder.";
            case "E" -> "You need to work a bit harder too.";
            case "F" -> "Uh oh!";
            default -> "Error, invalid grade.";
        };*/

        System.out.println(message);
    }
}
