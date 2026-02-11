package ex2;

public class Rectangle extends Figure {
	private float longueur;
	private float largeur;
	public Rectangle(Figure f,float longueur,float largeur) {
		super(f);
		this.longueur=longueur;
		this.largeur=largeur;
	}
	public Rectangle(float x,float y,int color,float longueur,float largeur) {
		super(x,y,color);
		this.longueur=longueur;
		this.largeur=largeur;
	}
	public float getLongueur() {
		return longueur;
	}
	public float getLargeur() {
		return largeur;
	}
}
