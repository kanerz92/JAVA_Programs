package a4.model;

public class Profiles {

	private String name; 
	private Genres preferredGenre;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genres getPreferredGenre() {
		return preferredGenre;
	}

	public void setPreferredGenre(Genres preferredGenre) {
		this.preferredGenre = preferredGenre;
	}	
}
