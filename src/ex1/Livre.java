package ex1;

public class Livre extends Document {
	private String auteur;
	private int nbpages;
	
	public Livre (Livre l ) {
		super(l);
		this.auteur=l.auteur;
		this.nbpages=l.nbpages;
	}
	
	public Livre (int numensg , String titre ,String auteur , int nbpages ) {
		super(numensg , titre);
		this.auteur=auteur;
		this.nbpages=nbpages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbpages() {
		return nbpages;
	}

	public void setNbpages(int nbpages) {
		this.nbpages = nbpages;
	}
	
	public void afficher() {
		System.out.println("\n auteur"+" "+auteur+"\n nombre de pages"+" "+nbpages);
		
	}
}
