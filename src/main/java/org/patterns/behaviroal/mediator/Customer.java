package org.patterns.behaviroal.mediator;

public class Customer {

    private String address;
    private EcommerceSite site;

    public Customer(String address) {
        this.address = address;
        this.site = new EcommerceSite();
    }
/* MOVED MEDIATOR
    private void buy(String item, int quantity){
        if(site.checkInStock(item, quantity))
            site.sell(item, quantity);
    }
    */


    public String getAddress() {
        return this.address;
    }
}
