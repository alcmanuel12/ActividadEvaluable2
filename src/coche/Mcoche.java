package coche;

import coche.Coche.Color;
import coche.Coche.Tipocoche;
import coche.Coche.Tipocombustible;

public class Mcoche {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Toyota", 2021, 1.8, Tipocombustible.DIESEL, Tipocoche.ADVANCE,Color.AMARILLO, 2, 2, 90, 600 );
		coche1.ImprimirXpantalla();
		coche1.Acelerar();
		//coche1.Desacelerar();
		//coche1.Frenar();
		coche1.Calculartiempo();
		
		
	}


}
