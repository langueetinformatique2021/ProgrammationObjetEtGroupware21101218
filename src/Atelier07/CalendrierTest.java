public class CalendrierTest {
    public static void main(String[] args) {
        // Crée un objet MonCalendrier
        Calendrier monCalendrier = new Calendrier();
        
        // Affiche la date de création
        monCalendrier.afficherCreation();
        
        // Affiche la date actuelle
        monCalendrier.afficherMaintenant();
        
        // Affiche la durée en secondes depuis la création
        monCalendrier.afficherDuree();
    }
}
