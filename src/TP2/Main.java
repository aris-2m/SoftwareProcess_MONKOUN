package TP2;

import TP2.beans.Adress;
import TP2.beans.CofeeShop_A;
import TP2.beans.Customer;
import TP2.services.Delivery;

public class Main {
    public static void main(String args[]){

        Customer customer=new Customer();

        Adress adress= new Adress("Casa", "08");
        CofeeShop_A cofeeShopA=new CofeeShop_A("ArisShop",adress);

        Delivery delivery= Delivery.getInstance();
        delivery.delivery(customer,cofeeShopA);
    }
}
