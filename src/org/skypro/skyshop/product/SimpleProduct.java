package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    public SimpleProduct(String title, int price) {
        super(title);
        this.price = price;
    }
    private int price;
    @Override
    public int getPrice() {
        return this.price;
    }
    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return getTitle() + " (" + getPrice() + ")";
    }
}
