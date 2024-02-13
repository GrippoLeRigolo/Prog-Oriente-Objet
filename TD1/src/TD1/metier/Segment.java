package TD1.metier;

public class Segment {
	private Point origine, extremite;

	public Segment(Point origine, Point extremite) {
		this.origine = origine;
		this.extremite = extremite;
	}

	public Segment(double xo, double yo, double xe, double ye) {
		origine = new Point(xo, yo);
		extremite = new Point(xe, ye);
	}

	public void deplacerOrigine(double dx, double dy) {
		origine.setX(dx);
		origine.setY(dy);
	}

	public void deplacerExtremite(double dx, double dy) {
		extremite.setX(dx);
		extremite.setY(dy);
	}

	public void affiche() {
		System.out.println(origine);
		System.out.println(extremite);
	}

	public double longueur() {
		double a = (extremite.getX() - origine.getX()) * (extremite.getX() - origine.getX());
		double b = (extremite.getY() - origine.getY()) * (extremite.getY() - origine.getY());
		return Math.sqrt(a - b);
	}
}
