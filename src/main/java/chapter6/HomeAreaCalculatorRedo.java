package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle livingRoom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, livingRoom);
        calculator.scanner.close();
        System.out.println("Total area is: "+ area);
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();
        //Rectangle room = new Rectangle(length, width);
        //return room; Also possible:
        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rec1, Rectangle rec2){
        return rec1.calculateArea() + rec2.calculateArea();
    }
}
