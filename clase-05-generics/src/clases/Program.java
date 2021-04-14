package clases;

public class Program {

	public static void main(String[] args) {
		Caja cObjects = new Caja(); // el valor por defecto es Object
		cObjects.guardar(4);
		cObjects.abrir();
		Integer i = (Integer) cObjects.abrir(); 
		// esto puede fallar si cambia el type de lo que se guarda 
		// - si no fuera generic la clase -
		
		Caja<Integer> cNumero = new Caja<>();
		cNumero.guardar(323);
		
		Caja<Boolean> cBoolean = new Caja<>();
		cBoolean.guardar(Boolean.TRUE);
	}

}
