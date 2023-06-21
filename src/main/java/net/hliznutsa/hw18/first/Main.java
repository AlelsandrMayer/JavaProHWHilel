package net.hliznutsa.hw18.first;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Книга", 300),
                new Product("Книга", 200),
                new Product("Ручка", 100),
                new Product("Книга", 400)
        );

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getType().equals("Книга"))
                .filter(p -> p.getPrice() > 250)
                .collect(Collectors.toList());

        System.out.println(filteredProducts);
    }
}
