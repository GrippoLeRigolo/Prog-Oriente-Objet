package TP1.application;

import TP1.metiers.Etudiant;
import TP1.metiers.Promotion_tab;
import TP1.metiers.Promotion_array;


public class Main_TP1 {

	public static void main(String[] args) {

		//Question 6
		Etudiant Gauvain = new Etudiant("LEPITRE", "Gauvain");
		Etudiant Thomas = new Etudiant("MANCHE", "Thomas");
		Etudiant Chloe = new Etudiant("MAES", "Chloe");
		Etudiant Paul = new Etudiant("LECOMPTE", "Paul");
		Etudiant Louis = new Etudiant("LLOVERAS", "louis");
		Etudiant Colas = new Etudiant("MADELON", "Colas");
		Etudiant Leandre = new Etudiant("LAVOISIER", "Leandre");
		
		 Thomas.setNotes();
		 Thomas.moy();
		 Gauvain.setNotes(); 
		 Gauvain.moy(); 
		 Gauvain.defMention();
		 
		 
		Chloe.setMoyenne(11.0);
		Chloe.defMention();
		Gauvain.setMoyenne(16.0);
		Thomas.setMoyenne(8.0);
		Colas.setMoyenne(20.0);
		Louis.setMoyenne(19.0);
		Leandre.setMoyenne(19.99);
		Paul.setMoyenne(13.0);
		System.out.println(Paul.compareMoyenne(Chloe));
		
		
		//Partie II
		//Question 6
		Promotion_tab Promo = new Promotion_tab();
		 
		
		 Promo.addEtu(Leandre);
		 Promo.addEtu(Chloe);
		 Promo.addEtu(Colas);
		 Promo.addEtu(Paul);
		 Promo.addEtu(Thomas);
		 
		 Promo.etuAdmis();
		 Promo.moyenneHaute();
		 Promo.triMoyennes();
		 Promo.afficheMoyenneEtu();		
		 
		//Question 7.6
		Promotion_array Promo_array = new Promotion_array();
		 
		
		 Promo_array.ajoutEtu(Leandre);
		 Promo_array.ajoutEtu(Chloe);
		 Promo_array.ajoutEtu(Colas);
		 Promo_array.ajoutEtu(Paul);
		 Promo_array.ajoutEtu(Thomas);
		 
		 
		 Promo_array.etuAdmis();
		 Promo_array.moyenneHaute();
		 Promo_array.triMoyennes();
		 Promo_array.afficheMoyenneEtu();		
		
	}
}
