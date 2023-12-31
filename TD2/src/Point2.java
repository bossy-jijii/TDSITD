


public class Point2 {
        private double abscisse;
        private double ordonnee;

        public Point2() {
            this.abscisse = 0.0;
            this.ordonnee = 0.0;
        }

        public Point2(double abscisse, double ordonnee) {
            this.abscisse = abscisse;
            this.ordonnee = ordonnee;
        }

        public double getAbscisse() {
            return abscisse;
        }

        public void setAbscisse(double abscisse) {
            this.abscisse = abscisse;
        }

        public double getOrdonnee() {
            return ordonnee;
        }

        public void setOrdonnee(double ordonnee) {
            this.ordonnee = ordonnee;
        }

        public double Norme() {
            return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        }

        public static void main(String[] args) {

            Point2 pointA = new Point2();
            System.out.println("Coordonnées du point A (par défaut) : (" + pointA.getAbscisse() + ", " + pointA.getOrdonnee() + ")");
            System.out.println("Norme du point A : " + pointA.Norme());

            pointA.setAbscisse(3.0);
            pointA.setOrdonnee(4.0);
            System.out.println("\nCoordonnées du point A (après modification) : (" + pointA.getAbscisse() + ", " + pointA.getOrdonnee() + ")");
            System.out.println("Norme du point A : " + pointA.Norme());

            Point2 pointB = new Point2(1.0, 2.0);
            System.out.println("\nCoordonnées du point B : (" + pointB.getAbscisse() + ", " + pointB.getOrdonnee() + ")");
            System.out.println("Norme du point B : " + pointB.Norme());
        }
    }

