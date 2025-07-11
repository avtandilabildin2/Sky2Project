package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Searchable;

public final class Article implements Searchable {
    private String title;
    private String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
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
