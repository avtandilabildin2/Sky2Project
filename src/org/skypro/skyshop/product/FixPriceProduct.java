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

    public FixPriceProduct(String productName) {
        super(productName);

    }

    @Override
    public String toString() {
        return getTitle()+": "+getPrice();
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
