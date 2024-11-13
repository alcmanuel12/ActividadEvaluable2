package viaLactea;

import viaLactea.ViaLactea.Elemento;

public class MViaLactea {

	public static void main(String[] args) {
		ViaLactea planeta1 = new ViaLactea("MARTE", 6.4171, 1.6318,  6779, Elemento.SOLIDO, true);
		planeta1.imprimirXpantalla();
		planeta1.calcularDensidad();
		planeta1.ESobservable();
	
		ViaLactea planeta2 = new ViaLactea("NEPTUNO", 2.1547, 3418,  8000, Elemento.GASEOSO, true);
		planeta2.imprimirXpantalla();
		planeta2.calcularDensidad();
		planeta2.ESobservable();
		
		ViaLactea planeta3 = new ViaLactea("ERIKSSON", 8.6715, 4.6584,  10000, Elemento.LIQUIDO, false);
		planeta3.imprimirXpantalla();
		planeta3.calcularDensidad();
		planeta3.ESobservable();
		
		
		ViaLactea planeta4 = new ViaLactea("H-460", 2.3548, 1.318,  847, Elemento.SOLIDO, false);
		planeta4.imprimirXpantalla();
		planeta4.calcularDensidad();
		planeta4.ESobservable();
	
	
	
	}



}
