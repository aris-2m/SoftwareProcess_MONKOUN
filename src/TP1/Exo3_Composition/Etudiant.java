package TP1.Exo3_Composition;

public class Etudiant {

    String nom;
    String num;
    String emploi;

    Filiere filiere;
    Ecole ecole;

    public Etudiant constructorNomNumEmploi(String nom, String num, String emploi){
        this.nom=nom;
        this.num=num;
        this.emploi=emploi;

        return this;
    }
}
