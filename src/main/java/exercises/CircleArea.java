package exercises;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Circle Area Calculator: ");
        System.out.println("Enter circle radius: ");
        double radius = scanner.nextDouble();

        double area = pi*(Math.pow(2, radius));
        System.out.println(area);
    }
}
