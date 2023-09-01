package org.example;

public class ShapeFactory {

    public ShapeFactory() {
    }

    public void createShape() {
        Shape shape;
        int i = (int) (4 * Math.random());

        switch (i) {
            case 1 -> {
                shape = new Circle(12, 24);
                if (shape instanceof Circle circle) {
                    circle.draw();
                    System.out.println("---------------");
                    System.out.println(circle);
                    circle.calculateArea();
                    circle.calculateCircumference();
                    System.out.println("---------------");
                    circle.erase();
                }
            }
            case 2 -> {
                shape = new Rectangle(12, 14, 10, 13);
                if (shape instanceof Rectangle rectangle) {
                    rectangle.draw();
                    System.out.println("---------------");
                    System.out.println(rectangle);
                    rectangle.calculateArea();
                    rectangle.calculatePerimeter();
                    System.out.println("---------------");
                    rectangle.erase();
                }
            }
            case 3 -> {
                shape = new Square(20);
                if (shape instanceof Square square) {
                    square.draw();
                    System.out.println("---------------");
                    System.out.println(square);
                    square.calculateArea();
                    square.calculatePerimeter();
                    System.out.println("---------------");
                    square.erase();
                }
            }
            case 4 -> {
                shape = new Triangle(10, 12, 13);
                if (shape instanceof Triangle triangle) {
                    triangle.draw();
                    System.out.println("---------------");
                    System.out.println(triangle);
                    triangle.calculateArea();
                    triangle.calculatePerimeter();
                    System.out.println("---------------");
                    triangle.erase();
                }
            }
        }
    }
}
