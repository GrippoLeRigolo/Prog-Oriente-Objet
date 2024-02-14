package TD2.metier;

import java.util.ArrayList;
import java.util.List;

public class Famille {
	public List<Personne> famille = new ArrayList<>();

	private int nb_membre;
	
	public Famille(int nb_membre) {
		this.nb_membre = nb_membre;
	}
	
	public void ajouter(Personne o) {
		famille.add(o);
	}
	
	public void afficherFraterie(Personne p) {
		for (Personne membre: famille) {
            if(p.pere == membre.pere && p.mere == membre.mere) {
            	System.out.println(membre.prenom + " est de la meme fraterie que " + p.prenom);
            }
        }
	}
	
	public List<Personne> getFraterie(Personne p) {
		List<Personne> fraterie = new ArrayList<>();
		for (Personne membre: famille) {
            if(p.pere == membre.pere && p.mere == membre.mere) {
            	fraterie.add(membre);
            }
        }
		return fraterie;
	}
	
	
	
	public void afficherOncle(Personne p) {
		List<Personne> fraterie_pere = getFraterie(p.pere);
		List<Personne> fraterie_mere = getFraterie(p.mere);
		
		for (Personne membre: fraterie_pere) {
			if(membre.genre == Genre.HOMME) {
				System.out.println(membre.prenom + " est l'oncle de " + p.prenom);
			}	
		}

		for (Personne membre: fraterie_mere) {
			if(membre.genre == Genre.HOMME) {
				System.out.println(membre.prenom + " est l'oncle de " + p.prenom);
			}	
		}		
	}
	
	
}