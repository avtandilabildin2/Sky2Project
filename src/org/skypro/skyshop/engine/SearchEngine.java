package org.skypro.skyshop.engine;

import org.skypro.skyshop.exception.BestResultNotFound;
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
    public Searchable searchable(String search) throws BestResultNotFound {
        Searchable searchable = null;
        int maxCount = 0;
        for (Searchable s : searchables) {
            int count = 0;
            int index = 0;
            if(s==null) {
                continue;
            }
            int indexString=s.searchTerm().indexOf(search,index);
            while (indexString!=-1){
                count++;
                index=indexString+search.length();
                indexString=s.searchTerm().indexOf(search,index);
            }
            if (count > maxCount) {
                maxCount = count;
                searchable=s;
            }
        }
        if (maxCount==0) {

            throw new BestResultNotFound("Элемента не нашлось!!!");
        }
        return searchable;
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
