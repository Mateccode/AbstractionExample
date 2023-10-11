package org.example;


public class Main {
    public static void main(String[] args) {
        Shape square = new Square(32, "Red", 4);
        Shape triangle = new Triangle(30,"orange", 32, 40);

        System.out.println(square.toString());
        System.out.println(triangle.toString());
    }
}
