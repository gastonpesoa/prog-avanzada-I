package singleton;

public class Program {

	public static void main(String[] args) {
		ManejoString ms = ManejoString.generarObjeto();
		int cantidad = ms.cantidad(new String("dfdfdf"));
		System.out.println(cantidad);
	}
}
