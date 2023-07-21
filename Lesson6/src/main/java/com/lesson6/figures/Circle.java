package com.lesson6.figures;

public class Circle implements Figures {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = Math.PI * 2 * radius;
        return perimeter;
    }
}
