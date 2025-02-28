package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args){

        //Rectangle 1

        //Create instance of Rectangle class. (Data type rectangle para room1 = calling default constructor for the object)
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //This has done the same thing than in the first one. But in a different way.
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);
    }
}
