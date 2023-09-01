package org.example;

public class Square extends Shape {
    protected double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("The square has been drawn.");
    }

    @Override
    public void erase() {
        System.out.println("The square has been erased.");
    }

    @Override
    public void calculateArea() {
        area = Math.pow(side, 2);
        System.out.println("Are of the square: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
    }

    @Override
    public String toString() {
        return "SQUARE INFO:" +
                "\n" +
                "\nSide - " + side +
                "\n";
    }

}
