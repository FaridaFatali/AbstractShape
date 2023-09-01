package org.example;

public abstract class Shape {
    protected double area;
    protected double circumference;
    protected double perimeter;

    public Shape() {
    }

    public abstract void draw();

    public abstract void erase();

    public abstract void calculateArea();

    public void calculateCircumference() {
    }

    public void calculatePerimeter() {
    }

}
