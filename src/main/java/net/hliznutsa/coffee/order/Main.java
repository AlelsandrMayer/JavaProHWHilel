package net.hliznutsa.coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add(new Order("Alen"));
        orderBoard.add(new Order("Yoda"));
        orderBoard.add(new Order("Obi-van"));
        orderBoard.add(new Order("John Snow"));

        orderBoard.draw();

        Order deliveredOrder = orderBoard.deliver();
        System.out.println("Выданный заказ: " + deliveredOrder.getName());

        orderBoard.draw();

        Order specificOrder = orderBoard.deliver(3);
        if (specificOrder != null) {
            System.out.println("Выданный заказ по номеру: " + specificOrder.getName());
        }

        orderBoard.draw();
    }
}

