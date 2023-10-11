package org.example;

public abstract class Shape {

    //size and color should be common to all subclasses of the Shape abstract class
    private int Size;
    private String Color;

    //area will be implemented in the way the subclass wants, that is if there is different
    //ways of doing the method, then use an abstract method, so it won't be implemented here
    //but be implemented the way that subclass wants
    // example area(), all shapes have area but the implementation of the area of a circle is
    // different from the implementation of the area of a Square and so forth
    //example2, all animals move(), but the way a tiger with 4 legs move is different from
    //the way a snake with no leg move
    //example3, all person sings(), but the way an artist sings is different from
    // the way a student sings, SO WE USE ABSTRACT METHODS HERE.
    abstract double area();
    public abstract String toString();

    //to set value of our fields to the constructor Shape

    public Shape(int size, String color) {
        this.Size = size;
        this.Color = color;
    }

    //after setting the values, we need another non-abstract method to get the values back
    public int getSize() {
        return Size;
    }

    public String getColor() {
        return Color;
    }
}