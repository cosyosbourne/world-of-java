package Usine;

import Monde.Hero;
import java.util.Random;


public class UHero {

    /**
     * Créer un personnage avec tous ses attributs.
     * Demande à l'utilisateur d'entrer le nom du personnage.
     * En retour : une instance de la classe Personnage correctement instancié.
     **/

    public static Hero build(){
        String nom = heroNom[new Random().nextInt(heroNom.length)];
        Integer pdv = new Random().nextInt(50,101);

        return new Hero (pdv, nom);
    }

    public static String[] heroNom = new String[] {
            "Lars", "Tim", "Mike", "Matt", "Melvin", "Tom", "Smelly", "Mark", "Fatty", "Travis", "Lindsay", "Jason"
    };
}
