package Monde;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
public class Equipe implements Iterable<IPersonnage> {

    private final List<IPersonnage> tab;
    public Equipe(){
        this.tab = new ArrayList<>();
    }

    // Permet d’ajouter un combattant à une équipe
    public void ajouterPersonnage(IPersonnage pPersonnage ){
        tab.add(pPersonnage);
    }

    @Override
    public Iterator<IPersonnage> iterator() {
        return tab.iterator();
    }
}
