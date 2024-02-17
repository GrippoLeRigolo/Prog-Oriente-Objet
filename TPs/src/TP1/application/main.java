package TP1.application;

import TP1.metiers.Etudiant;

public class main {

	public static void main(String[] args) {

		Etudiant Gauvain = new Etudiant("LEPITRE", "Gauvain");
		Etudiant Thomas = new Etudiant("MANCHE", "Thomas");
		Etudiant Chloe = new Etudiant("MAES", "Chloe");
		Etudiant Paul = new Etudiant("LECOMPTE", "Paul");
		/*
		 * Thomas.setNotes(); Thomas.moy();
		 * 
		 * Gauvain.setNotes(); Gauvain.moy(); Gauvain.defMention();
		 */
		Chloe.setMoyenne(11.0);
		Chloe.defMention();

		Paul.setMoyenne(13.0);
		System.out.println(Paul.compareMoyenne(Chloe));

	}
}
