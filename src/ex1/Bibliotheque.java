package ex1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Bibliotheque {
	public static void main (String args[]) {
	Document d = new Document(10,"hello");
	Livre l = new Livre (10,"hello","ranya",105);
	Dictionnaire dict= new Dictionnaire (10,"hello","arabe",6);
	Article A = new Article (10,"hello",LocalDateTime.of(2023,10,3, 10,30),LocalDateTime.now());
	d.afficher();
	l.afficher();
	dict.afficher();
	A.afficher();
	Listededocument liste = new Listededocument();
	liste.ajout(d);
	liste.ajout(A);
	liste.ajout(dict);
	liste.ajout(l);
	liste.rechercher(A);
	liste.supprimer(A);
	liste.aff();
	liste.touslesauteurs();
	
	}
	

}
