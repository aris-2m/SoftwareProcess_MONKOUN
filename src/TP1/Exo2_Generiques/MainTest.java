package TP1.Exo2_Generiques;

import java.util.Date;

public class MainTest {

    public static void main(String[] args){
        MyArrayList A1= new MyArrayList();

        A1.add(new Date());
        A1.add("Bonjour");
        A1.add(12);

        System.out.println(A1.get(10));
        System.out.println(A1.get(0));

        MyArrayList_Generique<String> A2= new MyArrayList_Generique<String>();

        A2.add("Bonjour");
        A2.add("Aris");

        System.out.println(A2.get(10));
        System.out.println(A2.get(0));

    }
}
