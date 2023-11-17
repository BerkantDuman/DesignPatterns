package org.patterns.behaviroal.iterator;

import java.util.Iterator;

public class Inventory implements Iterable{

    private  Item[] items;

    public Inventory(Item...items){
        this.items = items;
    }

    @Override
    public Iterator iterator() {
        return new StockIterator(this);
    }

    public Item[] getItems() {
        return items;
    }
}
