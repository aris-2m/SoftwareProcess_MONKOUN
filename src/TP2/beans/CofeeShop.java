package TP2.beans;

public abstract class CofeeShop implements ICofeeShop {
    String name;
    Adress adress;

    public CofeeShop(String name, Adress adress){
        this.name=name;
        this.adress=adress;
    }


    /*
    Une classe abstraite, c'est une classe qu'on veut empecher d'instancier,
    ie il lui faut des couches pour etre finie.
    Un peut comme une voiture en production, c'est une voiture on sait, mais pas utilisable,
    mais quand mm on a une idée de ce qu'elle pourrait contenir. Une classe abstraite est une
    classe arrivée à un certain niveau d'achevement.
     */

    /*
    Ici par exemple, le getInvoice sera propre à chaque classe, sans exception donc ça sert
    à rien de la définir ici, puisque la mettre ici c'est créer un code invoice par défaut.
    Alors que la facture peut eventuellement contenir des éléments propres à chaque shop, ...

    D'où l'abstraction, puisqu'un cofee shop doit cotenir un code pour accéder aux factures.
     */
}
