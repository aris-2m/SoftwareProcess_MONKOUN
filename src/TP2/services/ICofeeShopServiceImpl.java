package TP2.services;

import TP2.beans.ICofeeShop;

public class ICofeeShopServiceImpl implements ICofeeShopService {

    @Override
    public String generateInvoice(ICofeeShop shop) {
        return shop.getInvoice();
    }

}
