public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Nom de la figure : " + nom;
    }
}
public class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque() {
        super("Disque");
    }

    public Disque(Point centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    // Accesseurs et mutateurs pour centre et rayon

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * Math.pow(rayon, 2);
    }
}
public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Accesseurs et mutateurs pour longueur et largeur

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }
}
public class TestFigure {
    public static void main(String[] args) {
        // Test de la classe Disque
        Disque disque = new Disque(new Point(0, 0), 5.0);
        System.out.println(disque.toString());
        System.out.println("Périmètre du disque : " + disque.getPerimeter());
        System.out.println("Aire du disque : " + disque.getAire());

        // Test de la classe Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle.toString());
        System.out.println("Périmètre du rectangle : " + rectangle.getPerimeter());
        System.out.println("Aire du rectangle : " + rectangle.getAire());
    }
}
