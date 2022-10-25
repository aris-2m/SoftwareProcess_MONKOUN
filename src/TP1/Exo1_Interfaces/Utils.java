package TP1.Exo1_Interfaces;

public class Utils{

    public int add(int i, int j){
        return i+j;
    }

    public int compareInt(int i, int j){
        if (i<j){
            return -1;
        } else if (i>j) {
            return 1;
        }else return 0;
    }

    public int compareString(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        //Comparaison des lmin premiers caractères
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        //Si les lmin premiers caractères sont égaux
        if (l1 == l2) {
            return 0;
        }

        //Alors la plus longue chaine de caractère l'emporte
        else {
            return l1 - l2;
        }
    }

    public Additionnable add_(Additionnable a1, Additionnable a2){
        if (a1 == null) return a2;
        if (a2 == null) return a1;
        return a1.addTo(a2);
    }

    public int compare_(Comparable c1, Comparable c2){
        if (c1 == c2) return 0;
        if (c1 == null) return -1;
        if (c2 == null) return 1;
        return c1.compareTo(c2);
    }

    public Clonable clone_(Clonable c){
        if(c == null) return null;
        return c.clone();
    }

    public boolean save_(Enregistable e){
        if(e == null)
            throw new NullPointerException("Impossible to save this ...");

        return e.save();
    }

    public boolean send_(Envoyable e){
        if(e == null)
            throw new NullPointerException("Impossible to send this ...");
        return e.send();
    }

    public boolean test_(Testable t){
        if(t == null)
            throw new NullPointerException("Impossible to test this ...");
        return t.test();
    }
}

