package TD1.metier;

public class Point {

	private Double x;
	private Double y;
	private static int compteur = 0;
	private int numero;

	public Point() {
		this.x = 0.0;
		this.y = 0.0;
		compteur++;
		numero = compteur;
	}

	public Point(Double x, Double y) {
		this.x = x;
		this.y = y;
		compteur++;
		numero = compteur;
	}

	public int getNum() {
		return numero;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public String toString() {
		return (" numéro du point : " + numero + " x = " + x + " y = " + y);
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	public void deplacerPoint(double dx, double dy) {
		this.x = dx;
		this.y = dy;
	}

	public boolean egal(Point p) {
		return (this.x == p.x) && (this.y == p.y);
	}

}
