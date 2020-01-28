package constructores.concepto;

public class Persona {
	
	//Constructor por defecto 
	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apellido) {
		super();//LLama a object tiene un construtor
		//Con super llama al constructor de la clase padre, es this o super, no es la primera linea ejecutable
		//this(nombre);
		this.apellido = apellido;
		//this(nombre); no compila debe estar primera linea de ejecucion
	}
	
	/**
	 * Si no se pone llamadas al constructor padre por defector se llama a super(), si no se llama, llamada implicita
	 * LLnama a otros constructors con this, super, o con new
	 *  
	 *
	 */

}

/**
 * Llamadas a la 
 * Object es el papa de todas las clases 
*/