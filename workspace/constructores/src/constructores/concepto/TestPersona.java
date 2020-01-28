package constructores.concepto;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Alex");
		
		System.out.println("p:" + p);
	}
	
	/**
	 Errores de compilacion, errores de ejecucion
	 compilacion no ejecuta, no hay el constructor por defecto, hay un constructor sobrecargado
	 
	 LLamadas a constructores de la  misma clase o al padre
	 Con this() llama constructor de la misma llamada, pero la llamada a otro constructor debe 
	 se la primera linea ejecutable, si esta segundo da error de ejecion
	 */

}
