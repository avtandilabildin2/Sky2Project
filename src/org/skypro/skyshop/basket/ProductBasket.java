package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;
import java.util.stream.Stream;

public class ProductBasket {

    private Map<String,Product> productBasket;
    public ProductBasket() {
        productBasket = new HashMap<>();

    }
    public void addToProductBasket(Product product) {
        productBasket.put(product.getTitle(), product);

    }

    public Set<Product> deleteByName(String name) {

        Set<Product> result = new HashSet<>();
        if (productBasket.containsKey(name)) {
            result.add(productBasket.remove(name));

        } else{
            System.out.println("Продукт с таким именем не существует!!!");
        }

        return result;

    }

    public void printBasket() {

        productBasket.values()
                .stream()
                .forEach(i-> System.out.println(i.toString()));

    }
    public int sumOfProductBasket() {

        int sum = productBasket.values()
                .stream()
                .mapToInt(Product::getPrice)
                .sum();
        return sum;
    }
    public void allThing() {
        if (productBasket.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        System.out.println("Содержимое корзины!");
        productBasket.values().stream()
                .forEach(i-> System.out.println(i));

        int sum = sumOfProductBasket();
        long count=productBasket.values()
                .stream().filter(Product::isSpecial)
                .count();
        System.out.println("Итого: "+sum);
        System.out.println("Специальных товаров: "+count);
    }
    public boolean esExist(String productName) {
        return productBasket.containsKey(productName);
    }
    public void clearProductBasket() {
        productBasket.clear();
    }


}
