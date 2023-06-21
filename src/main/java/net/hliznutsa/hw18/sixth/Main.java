package net.hliznutsa.hw18.sixth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Книга", 100.0, false, LocalDate.of(2022, 1, 1)));
        products.add(new Product(2, "Книга", 120.0, true, LocalDate.of(2022, 2, 1)));
        products.add(new Product(3, "Игрушка", 50.0, true, LocalDate.of(2022, 2, 15)));
        products.add(new Product(4, "Игрушка", 70.0, false, LocalDate.of(2022, 3, 1)));

        Map<String, List<Product>> groupedProducts = groupProductsByType(products);
        System.out.println(groupedProducts);
    }

    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
