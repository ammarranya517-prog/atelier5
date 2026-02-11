package ex1;

public class Document {
	private int numensg;
	private String titre;
	
	public Document(Document d) {
		this.numensg= d.numensg;
		this.titre= d.titre;
	}
	
	public Document(int numensg , String titre) {
		this.numensg= numensg;
		this.titre= titre;
	}

	public int getNumensg() {
		return numensg;
	}

	public void setNumensg(int numensg) {
		this.numensg = numensg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void afficher() {
		System.out.println("\n numero d'enregistrement"+" "+numensg+" "+"\n titre"+""+titre);
		
	}
	
	
}
