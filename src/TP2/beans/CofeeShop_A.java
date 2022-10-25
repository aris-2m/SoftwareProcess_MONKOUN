package TP2.beans;

public class CofeeShop_A extends CofeeShop implements _TakableAway {

    public CofeeShop_A(String name, Adress adress){
        super(name, adress);
    }

    @Override
    public String getInvoice() {
        return "Invoice of A";
    }

    @Override
    public void getPayement() {
        System.out.println("Payement in CofeeShop A...");
    }

    @Override
    public void deliverCofee() {
        System.out.println("Delevering cofee A...");
    }

    @Override
    public String takeaway() {
        return "Delivery at most 30 minutes";
    }
}
