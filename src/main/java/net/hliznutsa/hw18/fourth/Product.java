package net.hliznutsa.hw18.fourth;

import java.time.LocalDateTime;

class Product {
    private String type;
    private double price;
    private boolean discount;
    private LocalDateTime dateAdded;

    public Product(String type, double price, boolean discount, LocalDateTime dateAdded) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Продукт: " +
                "тип='" + type + '\'' +
                ", цена=" + price +
                ",  скидка=" + (discount ? "Есть" : "Нет") +
                ", дата добавления=" + dateAdded + "\n";
    }
}
