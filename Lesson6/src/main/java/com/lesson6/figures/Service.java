package com.lesson6.figures;

public class Service {
    public static void main(String[] args) {
        Figures[] figures = {new Triangle(8, 9, 6, 6),
                new Triangle(5, 4, 9, 9),
                new Rectangle(5, 9),
                new Rectangle(7, 10),
                new Circle(5)
        };

        double Sum = 0;
        for (Figures el : figures) {
            Sum = el.getPerimeter() + Sum;
        }
            System.out.println("Сумма периметров фигур массива: " + Sum);
    }
}

