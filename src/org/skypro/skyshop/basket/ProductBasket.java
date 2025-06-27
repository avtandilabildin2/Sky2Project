package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {
    private Product[] productBasket=new Product[5];
    private int index=0;
    public void addToProductBasket(Product product) {
        if (index==productBasket.length) {
            System.out.println("Корзина полная!!!!");
            return;
        }
        productBasket[index] = product;
        index++;

    }
    public int sumOfProductBasket() {
        int sum=0;
        for(Product p : productBasket) {
            sum+=p.getPrice();
        }
        return sum;
    }
    public void allThing() {
        boolean exist=false;
        for(Product p : productBasket) {
            if(p!=null) {
                exist=true;
            }
        }
        if(!exist) {
            System.out.println("В корзине пусто");
            return;
        }
        int count=0;
        int sum=0;
        for(Product p : productBasket) {
            if(p!=null) {
                sum+=p.getPrice();
                System.out.println(p);
                if(p.isSpecial()){
                    count++;
                }
            }
        }
        System.out.println("Итого: "+sum);
        System.out.println("Специальных товаров: "+count);
    }
    public boolean esExist(String productName) {
        for(Product p : productBasket) {
            if(productName.equals(p.getTitle())){
                return true;
            }
        }
        return false;
    }
    public void clearProductBasket() {
        for(Product p : productBasket) {
            p=null;
        }
    }

    @Override
    public String toString() {
        String string="";
        int sum=0;
        int count=0;
        for(Product p : productBasket) {
            string+=p+"\n";
            if(p!=null) {
                sum+=p.getPrice();
            }
            sum+=p.getPrice();
            if(p.isSpecial()){
                count++;
            }
        }
        string+="Итого: "+sum+"\n";
        string+="Специальных товаров: "+count+"\n";
        return string;


    }
}
