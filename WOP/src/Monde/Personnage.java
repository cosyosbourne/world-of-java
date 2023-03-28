package Monde;

import Objets.Arme;

public abstract class Personnage {
    private int PointDeVie;
    private String nom;


    public Personnage(int PointDeVie, String nom) {
        this.PointDeVie = PointDeVie;
        this.nom = nom;
    }

    public Integer getPointDeVie() {
        return PointDeVie;
    }
    public void setPointDeVie(int PointDeVie) {
        this.PointDeVie = PointDeVie;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
