package ex1;

public class Dictionnaire extends Document {
	private String langue;
	private int nbrtomes;
	
	public Dictionnaire (Dictionnaire d ) {
		super(d);
		this.langue=d.langue;
		this.nbrtomes=d.nbrtomes;
	}
	
	public Dictionnaire (int numensg , String titre ,String langue , int nbrtomes ) {
		super(numensg , titre);
		this.langue=langue;
		this.nbrtomes=nbrtomes;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public int getNbrtomes() {
		return nbrtomes;
	}

	public void setNbrtomes(int nbrtomes) {
		this.nbrtomes = nbrtomes;
	}
	public void afficher() {
		System.out.println("\n langue"+" "+langue+"\n nombre de tomes"+" "+nbrtomes);
		
	}

}
