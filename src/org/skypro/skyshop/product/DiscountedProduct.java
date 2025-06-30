package org.skypro.skyshop.product;

public class DiscountedProduct extends Product
{
    public DiscountedProduct(String title,int price,int discountedPrice) {
        super(title);
        this.price = price;
        this.discountedPrice = discountedPrice;
    }
    private int price;
    private int discountedPrice;
    @Override
    public int getPrice() {
        int newPrice=price-price*discountedPrice/100;
        return newPrice;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
    @Override
    public String toString(){
        return getTitle()+": "+getPrice()+"("+getDiscountedPrice()+"%)";
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
        return getTitle()+": "+getPrice()+"("+getDiscountedPrice()+")"+type();
    }
}
