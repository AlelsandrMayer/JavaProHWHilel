package net.hliznutsa.hw5;

public class Square implements Shape {
    // Так как у квадрата все стороны равны, будем передавать только одну сторону что, бы не делать лишних проверок на прямоугольник
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
