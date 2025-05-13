package clases;

public class Punto {
	private int x;
	private int y;
	/**
	 * Crea un punto con un numero x y un punto y
	 * 
	 * @param x
	 * @param y
	 */
	public Punto (int x,int y) {
		this.x=x;
		this.y=y;
	}
	/**
	 * Crea un punto con el valor de x e y especificado
	 * 
	 */
	public Punto () {
		this.x=0;
		this.y=0;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}

}
