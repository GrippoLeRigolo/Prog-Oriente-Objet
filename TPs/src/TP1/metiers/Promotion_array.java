package TP1.metiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promotion_array {
	private List<Etudiant> Promo = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	//Question 7.1  
	public void ajoutEtu(Etudiant e1) {
		Promo.add(e1);
	}
	
	//Question 7.2
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

	//Question 7.3
	public void etuAdmis() {
		for (Etudiant etu : Promo) {
			if (etu.getMoyenne() >= 10) {
				System.out.println("l'étudiant " + etu.getPrenom() + " est admis avec une moyenne de : " + etu.getMoyenne());
			}
		}
	}
	//Question 7.4
	public void triMoyennes() {
		Etudiant temp;
		for (int i = 0; i < Promo.size(); i++) {
			for (int j = i; j < Promo.size(); j++) {
				if (Promo.get(i).getMoyenne() < Promo.get(j).getMoyenne()) {
					if (Promo.get(i).getMoyenne() < Promo.get(j).getMoyenne()) {
						temp = Promo.get(i);
						Promo.set(i, Promo.get(j));
						Promo.set(j, temp);
					}
				}
			}
		}
	}

	//Question 7.5
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
