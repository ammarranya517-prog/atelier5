package ex2;

public class Carre extends Figure{
	private float cote;
	public Carre (Figure f,float cote) {
		super(f);
		this.cote=cote;
	}
	public Carre (float x,float y,int color,float cote) {
		super(x,y,color);
		this.cote=cote;
	}
	public float getCote() {
		return cote;
	}
}
