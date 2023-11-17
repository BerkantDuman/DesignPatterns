package org.patterns.behaviroal.mediator;

import java.util.HashMap;

public class EcommerceSite {

    //private Customer customer;
    //private Driver driver;
    private HashMap<String, Integer> stock;


    public EcommerceSite() {
        //this.customer = customer;
        //this.driver = new Driver();
        stock = new HashMap<>();
        stock.put("item1", 100);
        stock.put("item2", 50);
        stock.put("item3", 10);
    }


    public boolean checkInStock(String item, int quantity) {
        if (stock.containsKey(item) && stock.get(item) > quantity)
            return true;
        return false;
    }

    public void sell(String item, int quantity) {
        int newQuantity = stock.get(item) - quantity;
        stock.put(item, newQuantity);
        //driver.deliver(item, quantity, customer);
    }
}
