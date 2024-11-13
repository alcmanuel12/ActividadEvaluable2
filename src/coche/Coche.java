package coche;

public class Coche {
	
	private String marca;
	private int modelo;
	private double motor;
	protected Tipocombustible tipocombustible;
	protected Tipocoche tipocoche;
	protected Color color;
	private int puertas;
	private int asientos;
	private static final int velocidad_MAX = 120;
	private int velocidad_act;
	private int distancia_destino;
	
	private int aumento_vel;
	private int descenso_vel;
	private double calculo_tiempo;
	
	
	protected enum Tipocombustible {DIESEL,BIODIESEL,GASNATURAL};
	protected enum Tipocoche {BERLINA, COMPACTO, FAMILIAR, ADVANCE, SUV};
	protected enum Color {BLANCO, NEGRO, ROSA, ROJO, AMARILLO, VERDE, AZUL, GRIS};
	
	
	public Coche(String marca,int modelo, double motor,Tipocombustible tipocombustible,Tipocoche tipocoche,Color color,int puertas,int asientos,int velocidad_act, int distancia_destino ) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.tipocombustible = tipocombustible;
		this.tipocoche = tipocoche;
		this.color = color;
		this.puertas = puertas;
		this.asientos = asientos;
		this.velocidad_act = velocidad_act;
		this.distancia_destino = distancia_destino;
			
	}
	
	public Coche (int aumento_vel, int descenso_vel, double calculo_tiempo) {
		
		this.aumento_vel = aumento_vel;
		this.descenso_vel = descenso_vel;
		this.calculo_tiempo = calculo_tiempo;
		
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public double getMotor() {
		return motor;
	}


	public void setMotor(double motor) {
		this.motor = motor;
	}


	public Tipocombustible getTipocombustible() {
		return tipocombustible;
	}


	public void setTipocombustible(Tipocombustible tipocombustible) {
		this.tipocombustible = tipocombustible;
	}


	public Tipocoche getTipocoche() {
		return tipocoche;
	}


	public void setTipocoche(Tipocoche tipocoche) {
		this.tipocoche = tipocoche;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public int getPuertas() {
		return puertas;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public int getAsientos() {
		return asientos;
	}


	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}


	public int getVelocidad_act() {
		return velocidad_act;
	}



	public static int getVelocidadMax() {
		return velocidad_MAX;
	}
	
	
	public void Acelerar() {
		
		if ( velocidad_act == 0 ) {
			
			System.out.println("El vehiculo no estaba en movimiento, ahora vas a 10 KM por hora");
			velocidad_act = 10;
			
		}else if (velocidad_act > 0) {
			
			System.out.println("Su velocidad era de " + velocidad_act + "KmH, ahora ha aumentado 30KmH");
			aumento_vel = velocidad_act + 30;
			velocidad_act = aumento_vel;
				
				if (velocidad_act > velocidad_MAX) {
					
					System.err.println("EL SISTEMA DE SEGURIDAD NO LE PERMITE REVASAR EL LIMITE LEGAL DE VELOCIDAD");
					velocidad_act = 120;
					System.err.println("SU VELOCIDAD SE HA QUEDADO EN " + velocidad_act + "KmH");
			
				} else {
			
			System.out.println("Su velocidad actual es de " + aumento_vel);
				
		}
		
	} else {
		
		System.err.println("Su vehiculo no puede tener una velocidad negativa");
	}
	}
	
	public void Desacelerar() {
		
		if (velocidad_act == 0) {
			System.err.println("Tu velocidad actual es 0 KmH no se puede desacelerar");
		}else {
			
			descenso_vel = velocidad_act - 30;
			
			System.out.println("Tu velocidad era de " + velocidad_act + "KmH, ahora ha descendido a " + descenso_vel + "KmH");
			
		}	
	}
	
	public void Frenar() {
		
		if (velocidad_act == 0) {
			System.out.println("Su coche ya esta parado");
		} else {
			
			System.out.println("Su choche ha frenado y ahora esta parado");
			velocidad_act = 0;
		}
	}
	
	public void Calculartiempo() {
		System.err.println("_____________________________________________________");
		System.out.println("La distancia de su destino es de " + distancia_destino + "Km");
		System.out.println("Su velocidad actual es de " + velocidad_act + "KmH");
		calculo_tiempo = distancia_destino / velocidad_act;
		System.out.println("El tiempo estimado de llegada a su destino es de " + calculo_tiempo + " Horas");	
		System.err.println("_____________________________________________________");
	}
	
	public void ImprimirXpantalla() {
		System.err.println("_____________________________________________________");
		System.out.println("La marca de su modelo es: " + marca);
		System.out.println("El modelo de su coche es: " + modelo);
		System.out.println("El motor de su coche es: " + motor);
		System.out.println("El tipo de combustible que usa su coche es: " + tipocombustible);
		System.out.println("Su coche es de tipo: " + tipocoche);
		System.out.println("El color de su coche es: " + color);
		System.out.println("El numero de puertas que posee su coche es de: " + puertas);
		System.err.println("_____________________________________________________");
		
		
	}

}
