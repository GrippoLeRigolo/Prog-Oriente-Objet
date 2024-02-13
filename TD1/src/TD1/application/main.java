package TD1.application;

import TD1.metier.*;

public class main {

	public static void main(String[] args) {

		Point p1 = new Point(4.0, 6.0);
		Point p3 = new Point(4.0, 6.0);
		
		p1.setX(8.9);
		p1.affiche();
		p3.affiche();
	
		Segment s1 = new Segment(p1, p3);
		s1.affiche();
		s1.deplacerExtremite(7.9, 2.0);
		s1.affiche();
	}
	
	
}
