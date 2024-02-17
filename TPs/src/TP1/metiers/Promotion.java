package TP1.metiers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Promotion {
	private List<Etudiant> Promo = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	public void ajoutEtu(Etudiant e1) {
		Promo.add(e1);
	}

	public void moyenneHaute() {
		Double moy = 0.0;
		String prenom = null;
		for (Etudiant etu : Promo) {
			if (etu.moyenne > moy) {
				moy = etu.moyenne;
				prenom = etu.prenom;
			}
		}
		System.out.println("la moyenne la plus haute est de " + moy + " et c'est celle de " + prenom);
	}

	public void etuAdmis() {
		for (Etudiant etu : Promo) {
			if (etu.moyenne >= 10) {
				System.out.println("l'étudiant " + etu.prenom + " est admis avec une moyenne de : " + etu.moyenne);
			}
		}
	}

	public void triMoyennes() {
		Etudiant temp;
		for (int i = 0; i < Promo.size(); i++) {
			for (int j = i; j < Promo.size(); j++) {
				if (Promo.get(i).moyenne < Promo.get(j).moyenne) {
					if (Promo.get(i).moyenne < Promo.get(j).moyenne) {
						temp = Promo.get(i);
						Promo.set(i, Promo.get(j));
						Promo.set(j, temp);
					}
				}
			}
		}
	}

	public void afficheMoyenneEtu() {
		System.out.println("Entrez le prenom de l'étudiant ");
		String tempPrenom = scan.nextLine();
		for (Etudiant etu : Promo) {
			if (tempPrenom == etu.prenom) {
				System.out.println("la moyenne de cet éudiant est : " + etu.moyenne);
			}
		}
	}

}
