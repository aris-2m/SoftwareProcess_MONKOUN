package TP1.Exo2_Generiques;

import java.util.ArrayList;

public class MyArrayList_Generique<T> {

    public ArrayList<T> List_;

    public MyArrayList_Generique(){
        this.List_=new ArrayList<T>();

        int i;
        for(i=0; i<10; i++){
            this.List_.add(null);
        }
    }

    public void add(T o){
        this.List_.add(o);
    }

    public Object get(int index){
        return this.List_.get(index);
    }
}
