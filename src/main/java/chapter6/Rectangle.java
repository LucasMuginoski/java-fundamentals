package chapter6;
/*
* Starting POO with TAU
* creating Rectangle object
* CLASSES AND OBJECTS
*/
public class Rectangle {
    //no class can directly access what is marked as private. That's why there is getters/setters and constructors
    //protected. Other classes INSIDE my package can access this. Similar to no access modifiers.
    private double length;
    private  double width;

    //Default constructor
    public Rectangle(){
        //initializing.
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        this.width = width;
        // setWidth(width); //this also works.It's here to demo alternative options
    }

    // getters and setters
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        //double length is set to THIS class length
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        //double width is set to THIS class width
        this.width = width;
    }

    //methods
    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }

    public double calculateArea(){
        return length*width;
    }
    /*Methods that do not have an explicit access modifier can be accessed by classes within the same package only.
    * That is why we need to say if it's public and going to be used outside the package
    */
}
