package com.lesson6.figures;

    public class Triangle implements Figures {
        int high;
        int side1;
        int side2;
        int side3;
        public Triangle (int high, int side1, int side2, int side3) {
            this.high = high;
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public double getArea() {
            double area = (high * side1)/2;
            return area;
        }
        public double getPerimeter() {
            double perimeter = side1 + side2 + side3;
            return perimeter;
        }
}
