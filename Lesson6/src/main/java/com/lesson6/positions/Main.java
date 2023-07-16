package com.lesson6.positions;

public class Main {
    public static void main(String[] args) {
        String text = "Занимаемая должность: ";
        Service pos = new Service();
        pos.getPosition(text, new Director());
    }
}
