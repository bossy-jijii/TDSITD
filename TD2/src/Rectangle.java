public class Rectangle {

    private double longueur;
    private double largeur;

    public Rectangle() {
        this.longueur = 0.0;
        this.largeur = 0.0;
    }

    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    public Rectangle(Rectangle rectangle) {
        this.longueur = rectangle.longueur;
        this.largeur = rectangle.largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive.");
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive.");
        }
    }


    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double aire() {
        return longueur * largeur;
    }

    public boolean isCarre() {
        return longueur == largeur;
    }

    public String toString() {
        return "Rectangle { Longueur=" + longueur + ", Largeur=" + largeur + " }";
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 8.0);
        Rectangle rectangle2 = new Rectangle(rectangle1);

        System.out.println("Rectangle 1 : " + rectangle1);
        System.out.println("Périmètre de Rectangle 1 : " + rectangle1.perimetre());
        System.out.println("Aire de Rectangle 1 : " + rectangle1.aire());
        System.out.println("Est-ce que Rectangle 1 est un carré ? " + rectangle1.isCarre());

        rectangle2.setLongueur(4.0);
        rectangle2.setLargeur(4.0);

        System.out.println("\nAprès modification de Rectangle 2 :");
        System.out.println("Rectangle 2 : " + rectangle2);
        System.out.println("Périmètre de Rectangle 2 : " + rectangle2.perimetre());
        System.out.println("Aire de Rectangle 2 : " + rectangle2.aire());
        System.out.println("Est-ce que Rectangle 2 est un carré ? " + rectangle2.isCarre());
    }
}
