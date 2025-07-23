package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {

    private Map<String,Product> productBasket;
    public ProductBasket() {
        productBasket = new TreeMap<>();

    }
    public void addToProductBasket(Product product) {
        productBasket.put(product.getTitle(), product);

    }

    public List<Product> deleteByName(String name) {

        List<Product> result = new LinkedList<>();
        if(productBasket.containsKey(name)) {
            result.add(productBasket.remove(name));

        }else System.out.println("Продукт с таким именем не существует!!!");


        return result;
    }

    public void printBasket() {
        for (Map.Entry<String,Product> entry : productBasket.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
    public int sumOfProductBasket() {
        int sum = 0;
        for (Map.Entry<String,Product> entry : productBasket.entrySet()) {
            sum += entry.getValue().getPrice();
        }
        return sum;
    }
    public void allThing() {
        if(productBasket.isEmpty()) {
            System.out.println("В корзине пусто");
            return;
        }
        int count=0;
        int sum=0;
        for (Map.Entry<String,Product> entry : productBasket.entrySet()) {
            if(entry.getValue()!=null) {
                sum+=entry.getValue().getPrice();
                System.out.println(entry.getValue());
                if(entry.getValue().isSpecial()){
                    count++;
                }
            }
        }
        System.out.println("Итого: "+sum);
        System.out.println("Специальных товаров: "+count);
    }
    public boolean esExist(String productName) {
        return productBasket.containsKey(productName);
    }
    public void clearProductBasket() {
        productBasket.clear();
    }

    @Override
    public String toString() {
        String string="";
        int sum=0;
        int count=0;
        for (Map.Entry<String,Product> entry : productBasket.entrySet()) {
            string+=entry.getValue()+"\n";
            if (entry.getValue()!=null) {
                sum+=entry.getValue().getPrice();
            }
            if (entry.getValue().isSpecial()) {
                count++;
            }
        }
        string+="Итого: "+sum+"\n";
        string+="Специальных товаров: "+count+"\n";
        return string;


    }
}
