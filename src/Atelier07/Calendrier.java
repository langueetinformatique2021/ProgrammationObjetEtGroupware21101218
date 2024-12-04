import java.util.*;

public class Calendrier extends GregorianCalendar {
    private long tempsCreation;

    // Constructeur : initialise le temps de création
    public MonCalendrier() {
        tempsCreation = System.currentTimeMillis(); // Temps actuel en millisecondes
    }

    // Méthode pour afficher la date de création
    public void afficherCreation() {
        System.out.println("Créé à : " + new Date(tempsCreation));
    }

    // Méthode pour afficher la date actuelle
    public void afficherMaintenant() {
        System.out.println("Actuellement : " + new Date());
    }

    // Méthode pour afficher la durée en secondes depuis la création
    public void afficherDuree() {
        long duree = (System.currentTimeMillis() - tempsCreation) / 1000; // en secondes
        System.out.println("Durée depuis la création (en secondes) : " + duree);
    }
}
