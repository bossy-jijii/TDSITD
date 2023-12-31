


package TD2;
public class Point {
        private char nom;
        private double abscisse;
        public Point(char nom, double abscisse) {
            this.nom = nom;
            this.abscisse = abscisse;
        }

        public void affiche() {
            System.out.println("Point " + nom + " : Abscisse = " + abscisse);
        }
        public void translate(double valeurTranslation) {
            abscisse += valeurTranslation;
        }

        public static void main(String[] args) {
            Point pointA = new Point('A', 5.0);

            System.out.println("Caractéristiques initiales du point :");
            pointA.affiche();
            double translation = 3.0;
            pointA.translate(translation);

            System.out.println("\nCaractéristiques après translation de " + translation + " unités :");
            pointA.affiche();
        }
    }

