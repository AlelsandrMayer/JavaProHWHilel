package net.hliznutsa.hw18.fifth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Книга", 50.0, true, LocalDate.now().minusMonths(12)));
        products.add(new Product("Книга", 60.0, false, LocalDate.now().minusMonths(1)));
        products.add(new Product("Книга", 70.0, true, LocalDate.now()));
        products.add(new Product("Книга", 80.0, false, LocalDate.now().minusWeeks(2)));
        products.add(new Product("Книга", 30.0, true, LocalDate.now()));

        double totalCost = calculateTotalCost(products);
        System.out.println("Общая стоимость: " + totalCost);
    }

    public static double calculateTotalCost(List<Product> products) {
        LocalDate currentDate = LocalDate.now();
        return products.stream()
                .filter(product -> product.getType().equals("Книга"))
                .filter(product -> product.getDateAdded().getYear() == currentDate.getYear())
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
