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
        return getTitle() + ": " + getPrice();
    }

    @Override
    public String searchTerm() {
        return toString();
    }

    @Override
    public String type() {
        return "PRODUCT";
    }

    @Override
    public String getSearchableName() {
        return getTitle();
    }

    @Override
    public String getStringRepresentation() {
        return getTitle()+" - "+getPrice()+" - "+type();
    }
}
