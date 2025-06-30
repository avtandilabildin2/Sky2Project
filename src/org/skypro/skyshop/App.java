package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.engine.SearchEngine;
import org.skypro.skyshop.product.*;

import java.util.Arrays;

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
        SearchEngine searchEngine=new SearchEngine(10);
        searchEngine.addSearchable(discountedProduct);
        searchEngine.addSearchable(simpleProduct);
        searchEngine.addSearchable(fixPriceProduct);
        Article article1=new Article("article1","text1");
        Article article2=new Article("article2","text2");
        Article article3=new Article("article3","text3");
        searchEngine.addSearchable(article1);
        searchEngine.addSearchable(article2);
        searchEngine.addSearchable(article3);
        System.out.println(Arrays.toString(searchEngine.search()));


    }

}
