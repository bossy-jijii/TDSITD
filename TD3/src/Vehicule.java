public class Vehicule {
    private int nbPassager;

    public Vehicule(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    @Override
    public String toString() {
        return "Nombre de passagers: " + nbPassager;
    }
}
public class Moto extends Vehicule {
    private int nbRoues = 2;

    // Pas de constructeur défini dans cette classe
}
public class Moto extends Vehicule {
    private int nbRoues = 2;

    public Moto(int nbPassager) {
        super(nbPassager);
    }
}
public class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbPassager) {
        super(nbPassager);
    }

    public Avion(int nbPassager, int nbMoteur) {
        super(nbPassager);
        this.nbMoteur = nbMoteur;
    }
}
public class Triporteur extends Moto {
    // Ajoutez des champs spécifiques à la classe Triporteur si nécessaire
}
