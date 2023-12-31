public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps() {
    }

    public Temps(int heures) {
        setHeures(heures);
    }

    public Temps(int heures, int minutes) {
        setHeures(heures);
        setMinutes(minutes);
    }

    public Temps(int heures, int minutes, int secondes) {
        setHeures(heures);
        setMinutes(minutes);
        setSecondes(secondes);
    }

    public Temps(Temps temps) {
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures >= 0 && heures <= 23) {
            this.heures = heures;
        } else {
            System.out.println("Heures incorrectes. Les heures doivent être entre 0 et 23.");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Minutes incorrectes. Les minutes doivent être entre 0 et 59.");
        }
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            System.out.println("Secondes incorrectes. Les secondes doivent être entre 0 et 59.");
        }
    }
    public void ajouterHeures(int heures) {
        int nouvelleHeure = (this.heures + heures) % 24;
        setHeures(nouvelleHeure);
    }

    public void ajouterMinutes(int minutes) {
        int nouvelleMinute = (this.minutes + minutes) % 60;
        ajouterHeures((this.minutes + minutes) / 60);
        setMinutes(nouvelleMinute);
    }

    public void ajouterSecondes(int secondes) {
        int nouvelleSeconde = (this.secondes + secondes) % 60;
        ajouterMinutes((this.secondes + secondes) / 60);
        setSecondes(nouvelleSeconde);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }

    public static void main(String[] args) {
        Temps temps1 = new Temps(12, 30, 45);
        System.out.println("Temps 1 : " + temps1);

        Temps temps2 = new Temps(18, 45);
        System.out.println("Temps 2 : " + temps2);

        temps1.ajouterHeures(5);
        temps2.ajouterMinutes(20);

        System.out.println("\nAprès ajout de temps :");
        System.out.println("Temps 1 : " + temps1);
        System.out.println("Temps 2 : " + temps2);
    }
}

