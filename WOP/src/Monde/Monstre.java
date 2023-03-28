package Monde;

import Objets.Arme;

public class Monstre extends Personnage implements IPersonnage {
    public Monstre(int PointDeVie, String name) {
        super(PointDeVie, name);
    }

    @Override
    public void setPointDeVie(Integer pointDeVie) {
    }

    @Override
    public Arme getArmes() {
        return null;
    }

    @Override
    public void setArmes(Arme armes) {
    }

    @Override
    public void attaquer(IPersonnage adversaire) {
        adversaire.setPointDeVie(this.getPointDeVie() - (this.getArmes().getDegats()));
    }
}
