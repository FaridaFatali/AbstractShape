package org.example;

public class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;

    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public void draw() {
        System.out.println("The rectangle has been drawn.");
    }

    @Override
    public void erase() {
        System.out.println("The rectangle has been erased.");
    }

    @Override
    public void calculateArea() {
        area = ((sideA + sideC) * (sideB + sideD)) / 4;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = sideA + sideB + sideC + sideD;
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    @Override
    public String toString() {
        return "RECTANGLE INFO:" +
                "\n" +
                "\nSideA - " + sideA +
                "\nSideB - " + sideB +
                "\nSideC - " + sideC +
                "\nSideD - " + sideD +
                "\n";
    }

}
