package net.hliznutsa.hw18.second;

class Product {
    private String type;
    private double price;
    private boolean discount;

    public Product(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return discount;
    }

    public void applyDiscount() {
        price *= 0.9;
    }
    @Override
    public String toString() {
        return "Продукт: " +
                "тип='" + type + '\'' +
                ", цена=" + price +
                ", скидка=" + discount ;
    }
}

