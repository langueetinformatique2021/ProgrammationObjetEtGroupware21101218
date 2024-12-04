package tp5;
import tp5.Date;
public class FeteNat {
		/** point d'entrée d'un exécutable */
		public static void main(String[] args) { 
			// Instanciation de deux objets de type date
			Date today = new Date(7, 11, 2024); 
			Date dfin = new Date(14, 7, 2025);

			today.Afficher(); dfin.Afficher();
			do { today.Incrementer(); today.Afficher(); }
			while (today.CompareTo(dfin));
			}

	}
