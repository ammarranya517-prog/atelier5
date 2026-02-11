package ex2;

public class Figure {
	private float x;
	private float y;
	private int color;
	public Figure(float x,float y,int color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	public Figure(Figure f) {
		x=f.x;
		y=f.y;
		color=f.color;
	}
	public void afficher() {
		System.out.println("X ="+x);
		System.out.println("Y ="+y);
		System.out.println("color ="+color);
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
}
