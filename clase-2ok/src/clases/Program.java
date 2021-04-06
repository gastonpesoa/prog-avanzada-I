package clases;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Gaston"); // a diferencia de la clase object siempre generan un nuevo objeto porque son un array de chars que no se pueden redimensionar
		s = "Otro nombre"; // aca se esta generando un nuevo objeto en el STACK de la memoria RAM y guardando la nueva referencia en la HEAP
	}

}
