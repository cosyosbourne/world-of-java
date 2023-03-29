package Usine;

import Monde.Hero;
import Objets.Arme;

import java.util.Random;

public class UArme {
    public static Arme build(){
        String nom = armeNom[new Random().nextInt(armeNom.length)];
        Integer d = new Random().nextInt(5,15);
        Integer l = new Random().nextInt(15,55);
        Integer p = new Random().nextInt(5,25);

        return new Arme (nom, d, l, p);
    }

    public static String[] armeNom = new String[] {"basse", "batterie", "guitare", "micro", "Ukulélé"};
}
