package net.hliznutsa.hw18.third;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Книга", 10.0, false),
                new Product("Книга", 15.0, true),
                new Product("Телефон", 500.0, true)
        );

        Product cheapestBook = products.stream()
                .filter(product -> product.getType().equals("Книга"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Продукт [категория: Книга] не найден"));

        System.out.println("Самый дешевый продукт категории 'Книга': " + cheapestBook);
    }
}
