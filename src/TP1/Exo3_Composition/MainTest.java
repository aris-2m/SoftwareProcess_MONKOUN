package TP1.Exo3_Composition;

public class MainTest {
    public static void main(String[] args){
        Etudiant etudiant=new Etudiant();
        etudiant=etudiant.constructorNomNumEmploi("MONKOUN", "ENSA180007", "Stagiaire");

        System.out.print(etudiant.nom);
    }
}
