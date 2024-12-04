package atelier03;

/**
 * Cette classe démontre le calcul de la valeur absolue d'un nombre.
 */
public class test {
    
    /**
     * Constructeur par défaut de la classe test.
     * Ce constructeur est implicitement fourni par Java et n'a pas de fonctionnalité spécifique.
     */
    public test() {
        // Constructeur vide
    }

    /**
     * Méthode principale qui calcule et affiche la valeur absolue d'un nombre.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        int x = -21, valAbsolue = x;
        
        // Calcul de la valeur absolue
        if (x < 0) {
            valAbsolue = -x;
        }
        
        // Affichage du résultat
        System.out.println("valeur absolue de " + x + ": " + valAbsolue);
    }
}
