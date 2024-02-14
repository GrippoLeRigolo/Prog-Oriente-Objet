package TD2.application;
import TD2.metier.*;

public class main {

	public static void main(String[] args) {
		Personne p1 = new Personne("Raphael", "Crapet", Genre.HOMME, 19);
		Personne p2 = new Personne("Tom", "Charpentier", Genre.HOMME, 19);
		
		Personne mere_Tom = new Personne("Pablette","Cadet", Genre.FEMME, 39);
		Personne pere_Tom = new Personne("Rheda","Pelardy", Genre.HOMME, 29);

		p2.setPere(pere_Tom);
		p2.setMere(mere_Tom);
		
		p1.afficher();
		p2.afficherParents();
	}

}
