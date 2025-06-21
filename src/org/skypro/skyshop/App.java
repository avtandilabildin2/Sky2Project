package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        DiscountedProduct discountedProduct=new DiscountedProduct("discounted product",1000,12);
        SimpleProduct simpleProduct=new SimpleProduct("simple product",1000);
        FixPriceProduct fixPriceProduct=new FixPriceProduct("fix price product");
        ProductBasket productBasket=new ProductBasket();
        productBasket.addToProductBasket(discountedProduct);
        productBasket.addToProductBasket(simpleProduct);
        productBasket.addToProductBasket(fixPriceProduct);
        productBasket.allThing();

    }

}
