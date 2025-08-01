package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

import java.util.Objects;

public final class Article implements Searchable{
    private String title;
    private String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Article article)) return false;

        return Objects.equals(title, article.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public String searchTerm() {
        return toString();
    }

    @Override
    public String type() {
        return "ARTICLE";
    }

    @Override
    public String getSearchableName() {
        return getTitle();
    }

    @Override
    public String getStringRepresentation() {
        return title+" - "+type();
    }

    @Override
    public String toString() {
        return title+" - "+text+" - "+type();
    }



}
