package chapter11;

public abstract class Shape {
    //class must be abstract since we've an abstract method.
    abstract double calculateArea();

    public void print(){
        System.out.println("I'm a shape");
    }
}
