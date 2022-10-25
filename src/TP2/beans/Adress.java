package TP2.beans;

public class Adress {
    String city, zipCode;

    public Adress(String city, String zipCode){
        this.city=city;
        this.zipCode=zipCode;
    }

    public void changeAdress(String city, String zipCode){
        this.city=city;
        this.zipCode=zipCode;
    }
}
