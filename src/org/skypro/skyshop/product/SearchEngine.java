package org.skypro.skyshop.product;

import java.util.Arrays;

public class SearchEngine {
    private int size;
    private int count;
    private Searchable[] searchables;
    public SearchEngine(int size) {
        this.size = size;
        searchables = new Searchable[size];
    }

    public Searchable[] search() {
        Searchable[] result = new Searchable[5];
        for (int i = 0; i <5 ; i++) {
            result[i]=searchables[i];
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
