package org.example;

public class Circle extends Shape {
    protected double radius;
    protected double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("The circle has been drawn.");
    }

    @Override
    public void erase() {
        System.out.println("The circle has been erased.");
    }


    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Are of the circle: " + area);
    }

    @Override
    public void calculateCircumference() {
        circumference = diameter * Math.PI;
        System.out.println("Circumference of the circle: " + circumference);
    }


    @Override
    public String toString() {
        return "CIRCLE INFO:" +
                "\n" +
                "\nRadius - " + radius +
                "\nDiameter - " + diameter +
                "\n";
    }

}
