package Monde;

import Usine.UArme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
public class Equipe implements Iterable<IPersonnage> {

    private final List<IPersonnage> tab;
    public Equipe(){
        this.tab = new ArrayList<>();
    }

    // Permet d’ajouter un personnage  à une équipe
    public void ajouterPersonnage(IPersonnage pPersonnage ){
        tab.add(pPersonnage);
    }

    // Permet d’ajouter une arme à un combattant en parcourant l’équipe
    public void ajouterArme(){
        for (IPersonnage perso: tab) {
            perso.setArmes(UArme.build());
        }
    }

    @Override
    public Iterator<IPersonnage> iterator() {
        return tab.iterator();
    }

    /*
    public static void afficherEquipe(Equipe equipe) {
        Iterator<IPersonnage> it = equipe.iterator();
        while (it.hasNext()) {
            IPersonnage personnage = it.next();
            System.out.println(personnage.toString());
        }
     */

}
