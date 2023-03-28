package Monde;

public abstract class Personnage {
    private int pointDeVie;
    private String nom;


    public Personnage(int pointDeVie, String nom) {
        this.pointDeVie = pointDeVie;
        this.nom = nom;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
