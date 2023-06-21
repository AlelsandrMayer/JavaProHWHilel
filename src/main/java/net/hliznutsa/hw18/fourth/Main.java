package net.hliznutsa.hw18.fourth;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Книга", 10.0, true, LocalDateTime.now().minusDays(2)));
        products.add(new Product("Книга", 20.0, false, LocalDateTime.now().minusDays(1)));
        products.add(new Product("Книга", 15.0, true, LocalDateTime.now()));
        products.add(new Product("Книга", 30.0, false, LocalDateTime.now().minusHours(2)));

        List<Product> latestProducts = getThreeLatestProducts(products);
        System.out.println(latestProducts);
    }

    public static List<Product> getThreeLatestProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}







