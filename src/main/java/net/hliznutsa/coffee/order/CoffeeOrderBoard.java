package net.hliznutsa.coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void add(Order order) {
        orders.offer(order);
        order.setNumber(orders.size());
    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int number) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getNumber() == number) {
                foundOrder = order;
                break;
            }
        }
        if (foundOrder != null) {
            orders.remove(foundOrder);
        }
        return foundOrder;
    }

    public void draw() {
        System.out.println("===================");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}