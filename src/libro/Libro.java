package libro;

public class Libro {
	
	private String nombre;
	private String escritor;
	protected Genero genero;
	private int paginas;
	private int anyo;
	private double calificacion;
	
	private boolean librolisto;

	protected enum Genero { HISTORIA, COMEDIA, NOVELA, TERROR };

	
	
	public Libro (String nombre, String escritor, Genero genero, int paginas, int anyo, double calificacion) {
		
		this.nombre = nombre;
		this.escritor = escritor;
		this.genero = genero;
		this.paginas = paginas;
		this.anyo = anyo;
		this.calificacion = calificacion;
		
	}
	
	public Libro (boolean librolisto) {
		
		this.librolisto = true;
	}


	public String getNombre() {
		return nombre;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEscritor() {
		return escritor;
	}


	private void setEscritor(String escritor) {
		this.escritor = escritor;
	}


	public Genero getGenero() {
		return genero;
	}


	private void setGenero(Genero genero) {
		this.genero = genero;
	}


	public int getPaginas() {
		return paginas;
	}


	private void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	public int getAnyo() {
		return anyo;
	}


	private void setAnyo(int anyo) {
		this.anyo = anyo;
	}


	public double getCalificacion() {
		return calificacion;
	}

	private void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	
	public void ImprimirXpantalla() {
		
		System.out.println("El titulo del libro es: " + nombre);
		System.out.println("El nombre del escritor es: " + escritor);
		System.out.println("El genero del libro es: " + genero);
		System.out.println("El numero de paginas del libro es: " + paginas);
		System.out.println("El libro se escribio en el año: " + anyo);
		System.out.println("La evaluacion del libro por sus lectores es: " + calificacion);
	
	}
	
	public void esLibroListo() {
		
		if(paginas < 50) {
			
			librolisto = true;
			

		}else {
			
			librolisto=false;
		}
		
	}
	
	public void calcularValoracion() {
		
		if (calificacion < 3) {
			
			System.out.println("La calificacacion es: MUY MALO");
		} else if (calificacion == 4 || calificacion == 5){
			
			System.out.println("La calificacacion es: MALO");
			
		} else if (calificacion == 6) {
			
			System.out.println("La calificacacion es: REGULAR");
		} else if (calificacion == 7 || calificacion == 8){
			
			System.out.println("La calificacacion es: BUENO");
		}else if (calificacion == 9 || calificacion == 10){
			
			System.out.println("La calificacacion es: EXELENTE");
			
		} else if (calificacion < 0) {
			
			System.err.println("No exite la calificacion en numeros negativos");
		} else {
			
			System.err.println("UTILIZE UNA CALIFICACION VALIDA EN LA TABLA DE CALIFICACIONES");
		}
	}
	
	
	public void esLibroSimilar(comparar) {
		
		if (calificacion = comparar) {
			
			
		}
		
		
		
		
	}
	
	
	

}