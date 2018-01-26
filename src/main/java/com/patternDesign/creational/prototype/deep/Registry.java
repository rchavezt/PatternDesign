package com.patternDesign.creational.prototype.deep;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
    }

    public Item createItem(String type){
        Item item = null;
        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(29.99);
        movie.setRuntime("2 Hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(355);
        book.setPrice(1.99);
        book.setTitle("Basic stuff");
        items.put("Book", book);
    }
}
