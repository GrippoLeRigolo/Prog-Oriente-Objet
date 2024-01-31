package TD1.metier;

public class Point {

	private Double x;
	private Double y;
	private static int compteur = 0;
	private int numero;

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
}
