package Objets;

public class Arme implements Item {
    private String nom;
    private int degats;
    private int longueur;
    private int poids;

    public Arme(String nom, int degats, int longueur, int poids) {
        this.nom = nom;
        this.degats = degats;
        this.longueur = longueur;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDegats() {
        return degats;
    }
    public void setDegats(int degats) {
        this.degats = degats;
    }

    public int getLongueur() {
        return longueur;
    }
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }
}
