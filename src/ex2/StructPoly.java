package ex2;

public class StructPoly {
	private final int Max=10;
	private Figure tab[];
	private int nb;
	public StructPoly() {
		tab=new Figure[Max];
		nb=0;
	}
    public void ajouter(Figure f) {
        if (nb<Max) {
        	int i=0;
        	while (tab[i]!=null)i++;
        	if(i<=Max) {
        		tab[i]=f;
        		nb++;
        		System.out.println("ajout avec succes");
        	}
        	else System.out.println("Pas de place");
        }
    }
    public void afficher() {
    	for(Figure f:tab) {
    		if(f!=null) {        		
            	if (f instanceof Carre) {
            		Carre c = (Carre) f;
            		System.out.println("Coté = "+c.getCote());
            		System.out.println("Permietre = "+(c.getCote()*2));
            		System.out.println("---------------------");
            	}
                else if(f instanceof Rectangle) {
                	Rectangle r=(Rectangle)f;
                	System.out.println("Largeur = "+r.getLargeur());
            		System.out.println("Longueur = "+r.getLongueur());
            		System.out.println("Permietre = "+((r.getLargeur()+r.getLongueur())*2));
                	System.out.println("---------------------");
                }
            	}
    	}
    }
    public void afficherStat() {
        int nbCarres = 0, nbRectangles = 0;
        for (Figure f : tab) {
            if (f instanceof Carre) nbCarres++;
            if (f instanceof Rectangle) nbRectangles++;
        }
        System.out.println("Nombre de Carrés: " + nbCarres);
        System.out.println("Nombre de Rectangles: " + nbRectangles);
    }
}
