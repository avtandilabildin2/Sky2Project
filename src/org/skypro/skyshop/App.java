package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.engine.SearchEngine;
import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws BestResultNotFound {
        try {
            SimpleProduct product=new SimpleProduct(null,1000);


        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try{
            SimpleProduct product=new SimpleProduct("product",-1000);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try{
            DiscountedProduct discountedProduct=new DiscountedProduct("",12,12);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try{
            DiscountedProduct discountedProduct=new DiscountedProduct("l",-12,12);

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try{
            DiscountedProduct discountedProduct=new DiscountedProduct("l",12,-12);

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        SearchEngine searchEngine=new SearchEngine(12);
        searchEngine.addSearchable(new SimpleProduct("Abildin",1000));
        System.out.println(searchEngine.searchable("Abil"));
        try{
            System.out.println(searchEngine.searchable("hello"));
        }catch (BestResultNotFound e) {
            System.out.println(e.getMessage());
        }


    }

}
