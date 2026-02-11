package ex1;
import java.util.Vector;

public class Listededocument {
	private Vector<Document> liste;
	
	public Listededocument() {
		liste= new Vector<>();
	}
	public void ajout (Document d)
	{
		liste.add(d);
	}
	
	public int rechercher(Document d) {
		return liste.indexOf(d);
	}
	
	public void supprimer(Document d)
	{
		liste.remove(d);
	}
	public void aff() {
		for (Document d : liste)
		{	if (d instanceof Livre)
			{
				Livre l = (Livre) d;
				l.afficher();
			}
		if (d instanceof Dictionnaire)
		{
			Dictionnaire dict = (Dictionnaire) d;
			dict.afficher();
		}
		if (d instanceof Article)
		{
			Article A = (Article) d;
			A.afficher();
		}
		}
	}
	public void touslesauteurs() {
	    for (Document d : liste) {
	        if (d instanceof Livre) {
	            Livre l = (Livre) d;
	            System.out.println("Auteur" + l.getAuteur());
	        }
	    }
	}

}
