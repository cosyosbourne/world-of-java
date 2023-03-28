package Monde;

import Objets.Arme;

public class Hero extends Personnage implements IPersonnage {
    public Hero(int PointDeVie, String nom) {
        super(PointDeVie, nom);
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
