package ex2;

public class TestStructPoly {
	 public static void main(String[] args) {
	        StructPoly figure = new StructPoly();
	        Carre c1=new Carre(1, 1, 255, 5);
	        Rectangle r1=new Rectangle(0, 0, 128, 4, 6);
	        figure.ajouter(c1);
	        figure.ajouter(r1);
	        figure.afficher();
	        figure.afficherStat();
	    }
}
