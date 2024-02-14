package TD2.metier;


public class Personne {
	public String prenom;
	private String nom;
	public Genre genre;
	private int age;
	public Personne pere;
	public Personne mere;
	
	public Personne(String prenom, String nom, Genre genre, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.age = age;	
	}
	
	public void setPere(Personne pere) {
		this.pere = pere;
	}
	
	public void setMere(Personne mere) {
		this.mere = mere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Personne getPere() {
		return pere;
	}

	public Personne getMere() {
		return mere;
	}
	
	public void afficher() {
		System.out.println("la personne s'appelle " + prenom + " " + nom + "est du grenre " + genre.getGenre() +" et a " + age);
	}
	public void afficherParents() {
		System.out.println("le pere de " + this.prenom + " est " + pere.prenom + " et sa mere est " + mere.prenom);
	}
	
	public void afficherGrandsParents() {
		System.out.println("les grands parents maternels sont " + mere.pere + " et " + mere.mere);
		System.out.println("les grands parents paternels sont " + pere.pere + " et " + pere.mere);
	}
	public boolean memePersonne(Personne p) {
		return (this.genre == p.genre) && (this.nom == p.nom) && (this.prenom == p.prenom) && (this.age == p.age); 
	}
	
	public boolean memeParents(Personne p) {
		return (this.mere == p.mere) && (this.pere == p.pere);
	}
	
}
