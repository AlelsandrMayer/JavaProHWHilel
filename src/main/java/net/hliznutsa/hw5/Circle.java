package net.hliznutsa.hw5;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
}
