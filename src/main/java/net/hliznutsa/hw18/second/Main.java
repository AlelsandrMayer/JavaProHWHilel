package net.hliznutsa.hw18.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Книга", 10.0, true),
                new Product("Книга", 15.0, false),
                new Product("Ручка", 5.0, true),
                new Product("Книга", 20.0, true)
        );

        List<Product> discountedBooks = products.stream()
                .filter(p -> p.getType().equals("Книга"))
                .filter(Product::hasDiscount)
                .peek(Product::applyDiscount)
                .collect(Collectors.toList());

        System.out.println(discountedBooks);
    }
}