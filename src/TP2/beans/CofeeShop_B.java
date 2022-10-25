package TP2.beans;

public class CofeeShop_B extends CofeeShop{
    public CofeeShop_B(String name, Adress adress){
        super(name, adress);
    }

    @Override
    public String getInvoice() {
        return "Invoice of B";
    }

    @Override
    public void getPayement() {
        System.out.println("Payement in CofeeShop B...");
    }

    @Override
    public void deliverCofee() {
        System.out.println("Delevering cofee B...");
    }
}
