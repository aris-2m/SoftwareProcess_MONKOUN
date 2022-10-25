package TP1.Exo2_Generiques;

import java.util.Date;

public class MainTest {

    public static void main(String[] args){
        /*
        MyArrayList A1= new MyArrayList();
        A1.add(1);
        A1.add(2);
        A1.add(12);
        A1.add(1);
        A1.add(1);
        A1.add(2);
        A1.add(12);
        A1.add(1);
        A1.add(1);
        A1.add(2);
        A1.add(2);

        int i=0;
        int sum= 0;
        for (i=0; i<A1.full; i++) {
            sum = sum + (int) A1.List_.get(i);
        }

        System.out.println(sum);
        System.out.println(A1.List_.size());

        */

        /*
        MyArrayList A1= new MyArrayList();

        A1.add(new Date());
        A1.add("Bonjour");
        A1.add(12);

        System.out.println(A1.get(0));
        */



        /**/
        MyArrayList_Generique<String> A2= new MyArrayList_Generique<String>();

        A2.add("Bonjour");
        A2.add("Aris");

        System.out.println(A2.get(0));
        System.out.println(A2.List_.size());

    }
}
