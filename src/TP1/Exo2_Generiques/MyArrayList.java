package TP1.Exo2_Generiques;

import java.util.ArrayList;

public class MyArrayList {
    public ArrayList<Object> List_;

    public MyArrayList(){
        this.List_=new ArrayList<>();

        int i;
        for(i=0; i<10; i++){
            this.List_.add(null);
        }
    }

    public void add(Object o){
        this.List_.add(o);
    }

    public Object get(int index){
        return this.List_.get(index);
    }
}
