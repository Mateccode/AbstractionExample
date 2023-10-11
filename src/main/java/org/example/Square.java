package org.example;

public class Square extends Shape {
    //radius is a property of subclass square which is specific to the Square subclass
    private double Side;

    //IF YOU CREATED A CONSTRUCTOR IN THE PARENT CLASS, YOU MUST ALSO CREATE A CONSTRUCTOR
    // IN THE SUBCLASS.
    public Square(int size, String color, double side) {
        //super keyword lets me call properties and methods of the Parent Class
        super(size, color);
        this.Side = side;

    }

    @Override
    double area() {
        return Side * Side;
    }

    @Override
    public String toString() {
        return "The Size is " + super.getSize() + ", The Color is " + super.getColor() + ", The Area is " + area();
    }





}
