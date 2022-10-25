package TP2.services;

import TP2.beans.CofeeShop;
import TP2.beans.Customer;

public class Delivery {
    private Delivery(){}

    public static Delivery instance =null;

    public static Delivery getInstance(){
        if (instance == null){
            instance=new Delivery();
        }
        return instance;
    }

    public void delivery(Customer customer, CofeeShop cofeeShop){
        customer.makePayement();
        cofeeShop.getPayement();

        cofeeShop.deliverCofee();
        customer.receiveCofee();
    }

}
