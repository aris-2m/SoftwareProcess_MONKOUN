package TP1.Exo2_Generiques;

import java.util.ArrayList;

public class MyArrayList_Generique<T> {

    public ArrayList<T> List_;
    public int full=0;

    public MyArrayList_Generique(){
        this.List_=new ArrayList<T>();

        int i;
        for(i=0; i<10; i++){
            this.List_.add(null);
        }
    }

    public void add(T o){
        if(o != null){
            if (full < List_.size()){
                this.List_.set(this.full,o);
            }
            else {
                this.List_.add(o);
            }
            this.full++;
        }
    }

    public Object get(int index){
        return this.List_.get(index);
    }
}
