package org.patterns.behaviroal.iterator;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("a", 1);
        Item item2 = new Item("b", 0);
        Item item3 = new Item("c", 5);


        Inventory inventory = new Inventory(item, item2, item3);

        StockIterator stockIterator = new StockIterator(inventory);

        while (stockIterator.hasNext()) {
            Item tItem = stockIterator.next();
            System.out.println(tItem.getName() + ":" + tItem.getQuantity());
        }
    }
}
