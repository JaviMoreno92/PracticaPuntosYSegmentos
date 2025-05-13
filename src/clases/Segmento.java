package clases;

public class Segmento {
	private Punto a;
	private Punto b;
	/**
	 * Crea el segmento formando por dos puntos con los valores dados 
	 * 
	 * @param Punto A
	 * @param Punto B
	 */
	public Segmento () {
		this.a = new Punto(0,0);
		this.b = new Punto(1,1);
	}
	/**
	 * Comprobamos si los puntos son iguales con un excepcion
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a,Punto b) {
		if(a.getX() == b.getX() && a.getY() == b.getY()) {
			throw new IllegalArgumentException("Los puntos no pueden ser iguales");
		} else {
			this.a =a;
			this.b =b;
		}
		
	}
	
	public Punto getA() {
		return this.a;
	}
	public Punto getB() {
		return this.b;
	}
	public void setA(Punto a) {
		this.a=a;
	}
	public void setB(Punto b) {
		this.b=b;
	}
	
	public String toString() {
		return "("+a.getX()+","+b.getX()+")"+","+"("+a.getY()+","+b.getY()+")";
	}
	/**
	 * Funcion que devuelve la distancia entre los dos puntos
	 * @return Distancia entre los puntos
	 */
	public double distancia () {
		return Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+ Math.pow((b.getY()-a.getY()), 2));
	}

}
