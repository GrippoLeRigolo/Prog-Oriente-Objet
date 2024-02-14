package TD2.metier;

public enum Genre {
	HOMME("Homme"),
	FEMME("Femme");
	
	private String genre;
	
	private Genre(String genre) {
		this.genre = genre; 
	}
	
	public String getGenre() {
		return genre;
	}


}
