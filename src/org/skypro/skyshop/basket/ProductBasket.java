package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

import java.util.*;

public class ProductBasket {
    List<Product> deletedProduct;
    private List<Product> productBasket;
    public ProductBasket() {
        productBasket = new LinkedList<>();
        deletedProduct = new LinkedList<>();
    }
    public void addToProductBasket(Product product) {
        productBasket.add(product);

    }
    public void printDeletedProduct() {

        Iterator<Product> iterator = deleteByName("").iterator();
        if(iterator==null) {
            System.out.println("Корзина пуста!!!");
            return;
        }
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }

    }
    public List<Product> deleteByName(String name) {
        for (Product product : deletedProduct) {
            product=null;
        }
        Iterator<Product> iterator = productBasket.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getTitle().equals(name)) {
                deletedProduct.add(product);
                iterator.remove();
            }
        }
        return deletedProduct;
    }

    public void printBasket() {
        Iterator<Product> iterator = productBasket.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
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
