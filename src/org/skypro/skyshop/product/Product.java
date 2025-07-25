package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    private String title;


    public Product(String title) {
        this.title = title;
        if(title == null ||title.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть пустым!!!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract int getPrice();
    public abstract boolean isSpecial();
}
