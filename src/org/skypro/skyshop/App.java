package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Apple",5);
        ProductBasket basket = new ProductBasket();
        basket.addToProductBasket(product);
        ProductBasket basket2 = new ProductBasket();
        basket2.addToProductBasket(new Product("product1",40));
        basket2.addToProductBasket(new Product("product2",40));
        basket2.addToProductBasket(new Product("product3",40));
        basket2.addToProductBasket(new Product("product4",40));
        basket2.addToProductBasket(new Product("product5",40));
        basket2.addToProductBasket(new Product("product6",40));
        System.out.println((basket2));
        basket2.allThing();
        System.out.println(basket2.sumOfProductBasket());
        basket2.esExist("product1");
        basket2.esExist("product10000");
        basket2.clearProductBasket();
        System.out.println(basket2);
        System.out.println(basket2.sumOfProductBasket());
        basket2.allThing();
        basket2.esExist("product1");
    }

}
