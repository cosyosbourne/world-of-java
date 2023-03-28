package Usine;

import Monde.Monstre;

import java.util.Random;

public class UMonstre {
    public static Monstre build(){
        String nom = nomMonstre[new Random().nextInt(nomMonstre.length)];
        Integer pdv = new Random().nextInt(32,112);
        return new Monstre (pdv,nom);
    }

    public static String[] nomMonstre = new String []{
            "Lady Gaga", "JuL", "Gims", "Kid Rock", "Lalanne", "Bigard", "MLP", "Zorglub", "Vlad", "Kim",
            "Krout", "Adhi", "Pinocheh"
    };
}
