public abstract class Personnage {
        protected String nom;
        protected String arme;
        protected int pointDeVie;
        protected int degats;

        public Personnage (String nom, String arme, int pointDeVie, int degats) {
            this.nom = nom;
            this.arme = arme;
            this.pointDeVie = pointDeVie;
            this.degats = degats;
        }

        public String getNom() {
            return nom;
        }

        public String getArme() {
            return arme;
        }

        public int getPointDeVie() {
            return pointDeVie;
        }

        public int getDegats() {
            return degats;
        }

        public abstract void attaquer(Personnage target);
}
