package net.hliznutsa.hw5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(7),
                new Triangle(4, 6, 9),
                new Square(8)
        };
        System.out.println("Суммарная площадь всех фигур " + getTotalArea(shapes));
    }

    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
