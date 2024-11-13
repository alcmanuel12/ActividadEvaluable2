package viaLactea;

public class ViaLactea {

	private String nombre = null;
	private double masaKG  = 0.0;
	private double volumenK3  = 0.0;
	private int diametroKM = 0;
	protected Elemento elemento;
	private boolean observable;
	private double densidad;

	
	protected enum Elemento {LIQUIDO, SOLIDO, GASEOSO};
	
	public ViaLactea(String nombre, double masaKG,double volumenK3 ,int  diametroKM ,Elemento elemento,boolean observable) {
		
		this.nombre = nombre ;
		this.masaKG = masaKG;
		this.volumenK3 = volumenK3;
		this.diametroKM = diametroKM;
		this.elemento = elemento;
		this.observable = observable;
}
	
	public void imprimirXpantalla() {
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Masa en kilogramos: " + masaKG);
		System.out.println("Volumen en kilometros cubicos: " + volumenK3);
		System.out.println("Diametro en kilometros: " + diametroKM);	
		System.out.println("El elemento es: " + elemento);
	}
	
	public void calcularDensidad() {
		
		this.densidad = masaKG / volumenK3;
		System.out.println("La densidad es: " + densidad);
			
	}
	
	
	public void ESobservable() {
		
		if (observable == false) {
			System.out.println("El elemento es EXTERIOR a la via lactea ");
		} else {
			System.out.println("El elemento de la via lactea es INTERIOR ");
		}		
	}
	
	
	
}

