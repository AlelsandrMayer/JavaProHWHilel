package net.hliznutsa.hw18.first;


class Product {
    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Товар: " + "Тип='" + type + '\'' + ", цена=" + price;
    }
}
