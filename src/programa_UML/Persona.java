package programa_UML;

public class Persona {
	
	// Añadimos los atributos que nos indican la actividad 1 
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int anyoDeNacimiento;
	
	// La actividad 1 se ha resuelto y procedemos a añadir los atributos necesarios para la actividad 2 
	
	private String paisOrigen;
	private char sexo= ' ';
	
	//Aqui hacemos el constructor definiendo todas las variables 
	public Persona(String nombre, String apellidos, String dni, int anyoDeNacimiento, String paisOrigen, char sexo) {
		
	this.nombre = nombre;
	this.dni = dni;
	this.apellidos = apellidos;
	this.anyoDeNacimiento = anyoDeNacimiento;
	//Añadimos los dos atributos nuevos al constructor 
	this.paisOrigen = paisOrigen;
	this.sexo = sexo;
	}
	
	
	//El metodo imprimir para poder sacar en PruebaPersona los datos de los objetos por pantalla 
	public void imprimirxpantalla() {
		System.out.println("Persona: " + nombre + " " + apellidos);
		System.out.println("Nombre = " + nombre);
		System.out.println("Apellidos = " + apellidos);
		System.out.println("DNI = " + dni);
		System.out.println("Año de nacimiento = " + anyoDeNacimiento);
		//Imprimimos por pantalla los dos atributos nuevos 
		System.out.println("Sexo= " + sexo);
		System.out.println("Pais Origen= " + paisOrigen);
		
	}
	
	
		
}
