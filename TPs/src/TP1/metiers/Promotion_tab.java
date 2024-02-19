package TP1.metiers;

import java.util.Scanner;

public class Promotion_tab {
	private Etudiant[] Promo = new Etudiant[5];
	Scanner scan = new Scanner(System.in);
	private static int n = 0;

	// Question 1
	public void addEtu(Etudiant e) {
		Promo[n] = e;
		n++;
	}

	// Question 2
	public void moyenneHaute() {
		Double moy = 0.0;
		String prenom = null;
		for (Etudiant etu : Promo) {
			if (etu.getMoyenne() > moy) {
				moy = etu.getMoyenne();
				prenom = etu.getPrenom();
			}
		}
		System.out.println("la moyenne la plus haute est de " + moy + " et c'est celle de " + prenom);
	}

	// Question 3
	public void etuAdmis() {
		for (Etudiant etu : Promo) {
			if (etu.getMoyenne() >= 10) {
				System.out.println(
						"l'étudiant " + etu.getPrenom() + " est admis avec une moyenne de : " + etu.getMoyenne());
			}
		}
	}

	// Question 4
	public void triMoyennes() {
		Etudiant temp = null;
		for (int i = 0; i < Promo.length; i++) {
			for (int j = i; j < Promo.length; j++) {
				if (Promo[i].getMoyenne() < Promo[j].getMoyenne()) {
					temp = Promo[i];
					Promo[i] = Promo[j];
					Promo[j] = temp;
				}
			}
		}
	}

	// Question 5
	public void afficheMoyenneEtu() {
		System.out.println("Entrez le prenom de l'étudiant ");
		String tempPrenom = scan.nextLine();
		for (Etudiant etu : Promo) {
			if (tempPrenom.equals(etu.getPrenom())) {
				System.out.println("la moyenne de cet éudiant est : " + etu.getMoyenne());
			}
		}
	}

}
