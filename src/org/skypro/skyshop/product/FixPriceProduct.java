package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {


    @Override
    public boolean isSpecial() {
        return true;
    }

    private static final int FIX_PRICE_PROUCT=100;

    public int getPrice() {
        return FIX_PRICE_PROUCT;
    }
    private String productName;
    public FixPriceProduct(String productName) {
        super(productName);

    }

    @Override
    public String toString() {
        return getTitle()+": "+getPrice();
    }
}
