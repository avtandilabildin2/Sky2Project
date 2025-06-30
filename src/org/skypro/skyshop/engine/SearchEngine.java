package org.skypro.skyshop.engine;

import org.skypro.skyshop.product.Searchable;

import java.util.Arrays;

public class SearchEngine {
    private int size;
    private int count;
    private Searchable[] searchables;
    public SearchEngine(int size) {
        this.size = size;
        searchables = new Searchable[size];
    }

    public Searchable[] search(String term) {
        Searchable[] result = new Searchable[5];
        for (int i = 0; i <5 ; i++) {
            if(searchables[i].searchTerm().contains(term)) {
                result[i] = searchables[i];
            }
        }
        return result;
    }
    public void addSearchable(Searchable searchable) {
        if(count<size) {
            searchables[count] = searchable;
            count++;
        }
        else{
            System.out.println("Заполнен!!!");
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(searchables);
    }
}
