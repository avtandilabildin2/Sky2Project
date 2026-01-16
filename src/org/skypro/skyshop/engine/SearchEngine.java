package org.skypro.skyshop.engine;

import org.skypro.skyshop.comparators.Comparator1;
import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.Searchable;

import java.util.*;

public class SearchEngine  {


    private Set<Searchable> searchables;
    public SearchEngine() {

        searchables = new HashSet<>((Collection) new Comparator1());
    }

    public Searchable searchable(String search) throws BestResultNotFound {
        Searchable searchable = null;
        int maxCount = 0;
        for (Searchable s : searchables) {
            int count=0;
            int index=0;
            if (s==null) {
                continue;
            }
            int indexString=s.searchTerm().indexOf(search,index);
            while (indexString!=-1) {
                count++;
                index=indexString+search.length();
                indexString=s.searchTerm().indexOf(search,index);
            }
            if (count>maxCount) {
                maxCount=count;
                searchable = s;
            }
        }
        if (maxCount==0) {
            throw new BestResultNotFound("Элемента не нашлось!!!");
        }
        return searchable;
    }
    public Map<String,Searchable> search(String term) {
        Iterator<Searchable> iterator = searchables.iterator();
        Map<String,Searchable> result = new TreeMap<>();
        int count=0;
        while (iterator.hasNext()) {
            Searchable s = iterator.next();
            if (s.searchTerm().contains(term)) {
                result.put(s.getSearchableName(), s);
                count++;
                if (count==5){
                    break;
                }
            }
        }
        return result;

    }
    public void addSearchable(Searchable searchable) {
        searchables.add( searchable);

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
