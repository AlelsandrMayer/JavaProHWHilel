package net.hliznutsa.hw18.sixth;

import java.time.LocalDate;

class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate dateAdded;

    public Product(int id, String type, double price, boolean discount, LocalDate dateAdded) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Продукт = " +
                "id: " + id +
                " тип: " + type + '\'' +
                ", цена: " + price +
                ",  скидка: " + (discount ? "Есть" : "Нет") +
                ", дата добавления: " + dateAdded + "\n";
    }
}
