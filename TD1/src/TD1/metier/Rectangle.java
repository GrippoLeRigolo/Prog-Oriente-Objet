package TD1.metier;

public class Rectangle {
	private double longueur, largeur;
	private Point origine;

	public Rectangle(Point origine, double longueur, double largeur) {
		this.largeur = largeur;
		this.longueur = longueur;
		this.origine = origine;
	}

	public String toString() {
		return (" origine : " + origine + " longueur = " + longueur + " largeur = " + largeur);
	}

	public double Surface() {
		return (longueur * largeur);
	}

	public void affiche() {
		System.out.println(origine);
		System.out.println(largeur);
		System.out.println(longueur);
	}

	public boolean egal(Rectangle r) {
		return (this.longueur == r.longueur) && (this.largeur == r.largeur);
	}
	
	public boolean contient(Rectangle r) {
		return(this.longueur >= r.longueur) && (this.largeur >= r.largeur);
	}
}
