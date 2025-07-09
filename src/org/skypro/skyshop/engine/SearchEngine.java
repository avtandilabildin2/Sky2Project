package org.skypro.skyshop.engine;

import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.Searchable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchEngine {

    private int count;
    private List<Searchable> searchables;
    public SearchEngine() {

        searchables = new LinkedList<>();
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
    public List<Searchable> search(String term) {
        Iterator<Searchable> iterator = searchables.iterator();
        List<Searchable> result = new LinkedList<>();
        int count = 0;
        while (iterator.hasNext()) {
            Searchable s = iterator.next();
            if (s.searchTerm().contains(term)) {
                result.add(s);
                count++;
                if (count == 5) {
                    break;
                }
            }
        }

        return result;

    }
    public void addSearchable(Searchable searchable) {
        searchables.add(searchable);

    }

    @Override
    public String toString() {
        String results = "";
        for (Searchable s : searchables) {
            results = results + s + "\n";
        }
        return results;
    }
}
