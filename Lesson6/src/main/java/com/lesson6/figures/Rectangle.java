package com.lesson6.figures;

public class Rectangle implements Figures {
    private int high;
    private int width;

    public Rectangle (int high, int width) {
        this.high = high;
        this.width = width;
    }
    public double getArea() {
        int area = high * width;
        return area;
    }
    public double getPerimeter() {
        int perimeter = 2 * (high + width);
        return perimeter;
    }
}
