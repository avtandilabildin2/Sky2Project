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
        for(Product p : productBasket) {
            System.out.println(p);
        }
        System.out.println("Итого: "+sumOfProductBasket());
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
            if(p!=null) {
                string+=p+"\n";
                sum+=p.getPrice();
                count++;
            }

        }
        string+="Итого: "+sum+"\n";
        string+="Специальных товаров: "+count+"\n";
        return string;


    }
}
