package org.example;

public class Triangle extends Shape{

    //properties specific to triangles

    private double Base;
    private double Height;


    //all subclass will have a constructor to set the values of properties
    public Triangle(int size, String color, double base, double height) {
        super(size, color);
        this.Base = base;
        this.Height = height;

    }

    @Override
    double area() {
        return (Base * Height) / 2;
    }

    @Override
    public String toString() {
        return "The Size is " + super.getSize() + ", The Color is " + super.getColor() + ", The base is " + Base +", The height is "+ Height + ", The Area is " + area();
    }
    //implement area() in Shape parent class here







}
