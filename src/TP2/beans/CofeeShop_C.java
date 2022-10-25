package TP2.beans;

public class CofeeShop_C extends CofeeShop{
    public CofeeShop_C(String name, Adress adress){
        super(name, adress);
    }

    @Override
    public String getInvoice() {
        return "Invoice of C";
    }
    @Override
    public void getPayement() {
        System.out.println("Payement in CofeeShop C...");
    }

    @Override
    public void deliverCofee() {
        System.out.println("Delevering cofee C...");
    }
}