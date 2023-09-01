package org.example;

public class Triangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        System.out.println("The triangle has been drawn.");
    }

    @Override
    public void erase() {
        System.out.println("The triangle has been erased.");
    }

    @Override
    public void calculateArea() {
        System.out.print("The area od triangle can be various: ");
    }

    @Override
    public void calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    @Override
    public String toString() {
        return "TRIANGLE INFO:" +
                "\n" +
                "\nSideA - " + sideA +
                "\nSideB - " + sideB +
                "\nSideC - " + sideC +
                "\n";
    }

}
