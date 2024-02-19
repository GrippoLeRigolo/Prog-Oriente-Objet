package TP1.metiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Etudiant {
	//Question 1
	private String nom, prenom, mention;
	private Double moyenne = 0.0;
	private List<Double> T = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	//Question 2
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	//Question 3
	public String getNom() {
		return nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	public Double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}
	
	
	public void setNotes() {
		System.out.println("Etudiant : " + this.prenom);
		for(int i = 0; i < 4; i++) {
			System.out.println("Entrez la note " + (i + 1));
			T.add(scan.nextDouble());
		}
	}
	
	//Question 4
	public void moy() {
		for(Double notes: T) {
			this.moyenne += notes;
		}
		
		this.moyenne = this.moyenne /4;
		System.out.println("La moyenne de " + this.prenom + " est de : " + this.moyenne);
	}
	
	//Question 5
	public void defMention() {
		System.out.println("la mention de " + this.prenom + " est : ");
		if(this.moyenne < 10) {
			System.out.println("Rattrapages");
		}
		else if(this.moyenne >= 10 && this.moyenne < 12) {
			System.out.println("Mention Passable");
		}
		else if(this.moyenne >= 12 && this.moyenne < 14) {
			System.out.println("Mention Assez Bien");
		}
		else if(this.moyenne >= 14 && this.moyenne < 16) {
			System.out.println("Mention Bien");
		}
		else if(this.moyenne >= 16) {
			System.out.println("Très Bien");
		}
	}
	
	//Question 7
	public int compareMoyenne(Etudiant e1) {
		if (e1.moyenne > this.moyenne) {
			return -1;
		}
		else if (e1.moyenne < this.moyenne) {
			return 1;
		}
		else {return 0;}
	}
}
