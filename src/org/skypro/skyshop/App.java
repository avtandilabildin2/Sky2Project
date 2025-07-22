package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.engine.SearchEngine;
import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.*;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws BestResultNotFound {
        SimpleProduct simpleProduct1=new SimpleProduct("title1",12);
        SimpleProduct simpleProduct2=new SimpleProduct("title2",12);
        SimpleProduct simpleProduct3=new SimpleProduct("title3",12);
        SimpleProduct simpleProduct4=new SimpleProduct("title4",12);
        SimpleProduct simpleProduct5=new SimpleProduct("title5",12);
        ProductBasket basket=new ProductBasket();
        basket.addToProductBasket(simpleProduct1);
        basket.addToProductBasket(simpleProduct2);
        basket.addToProductBasket(simpleProduct3);
        basket.addToProductBasket(simpleProduct4);
        basket.addToProductBasket(simpleProduct5);
        basket.deleteByName("title1");
        basket.deleteByName("title2");
        basket.deleteByName("title3");


        basket.printBasket();
        basket.deleteByName(null);
        ProductBasket basket2=new ProductBasket();

        SearchEngine searchEngine=new SearchEngine();
        searchEngine.addSearchable(new SimpleProduct("title1",12));
        searchEngine.addSearchable(new SimpleProduct("title2",12));
        searchEngine.addSearchable(new SimpleProduct("title3",12));
        System.out.println(searchEngine.searchable("title2"));
        SimpleProduct simpleProduct=new SimpleProduct("title4",12);
        System.out.println(simpleProduct.searchTerm());
        System.out.println(searchEngine.search("tit"));
        List<Product> deletedProducts=basket.deleteByName("title1");
        if(deletedProducts.isEmpty()){
            System.out.println("Корзина пуста!!!");
        }
        else{
            for(Product p:deletedProducts){
                System.out.println(p);
            }
        }


    }


}
