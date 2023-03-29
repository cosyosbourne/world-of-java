package Monde;

import Objets.Arme;
import Usine.UArme;
import Usine.UHero;
import Usine.UMonstre;

public class Monde {
    public void Lancement(){

        /*
        Monstre monstre1 = UMonstre.build();
        Arme arme1 = UArme.build();
        System.out.println("Le monstre "+monstre1.getNom()+
                " a " +monstre1.getPointDeVie()+
                " PVs. Il possède une arme de type "+arme1.getNom()+
                " qui peut infliger "+arme1.getDegats()+
                " points de dégât.");

        Hero hero1 = UHero.build();
        System.out.println("Le héros "+hero1.getNom()+" a "+hero1.getPointDeVie()+" PVs.");
        */

        // Créer une équipe de héros
        Equipe equipeH = new Equipe();
        System.out.println("-- Équipe des héros --");
        System.out.println();

        // Ajouter des héros à l'équipe en utilisant la classe UHero et afficher leur nom et pdv
        for (int i = 0; i < 5; i++) {
            Hero hero = UHero.build();
            equipeH.ajouterPersonnage(hero);
            // System.out.println(hero.getNom()+" : "+hero.getPointDeVie()+" PVs.");
        }

        for (IPersonnage perso: equipeH) {
            Arme arme = UArme.build();
            perso.setArmes(arme);
            System.out.println(perso.getNom()+" : "
                    +perso.getPointDeVie()+" PVs. Arme : "
                    +arme.getNom()+", dégâts : "
                    +arme.getDegats());
        }


        /*
        Afficher les héros de l'équipe, méthode alternative

        for (Monde.IPersonnage personnage : equipeH) {
            if (personnage instanceof Hero hero) {
                System.out.println(hero.getNom());
            }
        }
         */

        // Créer une équipe de monstres
        Equipe equipeM = new Equipe();
        System.out.println();
        System.out.println("-- Équipe des monstres --");
        System.out.println();

        // Ajouter des monstres à l'équipe en utilisant la classe UMonstre
        for (int i = 0; i < 5; i++) {
            Monstre monstre = UMonstre.build();
            equipeM.ajouterPersonnage(monstre);
            System.out.println(monstre.getNom()+" : "+monstre.getPointDeVie()+" PVs.");

        }
    }
}
