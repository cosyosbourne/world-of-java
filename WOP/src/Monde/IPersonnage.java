package Monde;

import Objets.Arme;
/**
 * Interface qui contient tous les getter et setter dont les
 * héros et monstres vont avoir besoin pour exister
 */
public interface IPersonnage {

    public String getNom();
    public void setNom(String nom);

    public Integer getPointDeVie();
    public void setPointDeVie(Integer pointDeVie);

    public Arme getArmes();
    public void setArmes(Arme armes);

    public void attaquer(IPersonnage adversaire);
}
