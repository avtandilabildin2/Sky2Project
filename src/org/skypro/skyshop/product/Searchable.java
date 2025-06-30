package org.skypro.skyshop.product;

public interface Searchable{
    String searchTerm();
    String type();
    String getSearchableName();
    default String getStringRepresentation(){
        return getSearchableName()+" - "+type();
    }
}
