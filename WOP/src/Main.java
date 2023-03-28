import Monde.Hero;
import Monde.Monstre;
import Usine.UHero;
import Usine.UMonstre;

public class Main {
    public static void main(String[] args) {

        Monstre monstre1 = UMonstre.build();
        System.out.println("Le monstre "+monstre1.getNom()+ " a " +monstre1.getPointDeVie()+ " PVs.");

        Hero hero1 = UHero.build();
        System.out.println("Le héros "+hero1.getNom()+" a "+hero1.getPointDeVie()+" PVs.");
    }
}